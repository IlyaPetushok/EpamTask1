package java.by.petushokilya.reader.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.by.petushokilya.exception.CustomException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ArrayReaderImpl implements java.by.petushokilya.reader.ArrayReader {
    private static final Logger logger = LogManager.getLogger(ArrayReaderImpl.class.getName());

    public ArrayReaderImpl() {
    }

    @Override
    public List<String> readStringFromFile(String path) throws CustomException {
        List<String> list = new ArrayList<>();
        cheakFileOfError(path);
        try {
            String line;
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            logger.error("Exception reading",e);
            throw new CustomException(e);
        }
        logger.info("The reading ended successfully");
        return list;
    }

    private void cheakFileOfError(String path) throws CustomException {
        if (!Files.exists(Paths.get(path))) {
            logger.error("File is not found");
            throw new CustomException("File is not found");
        }

        if (!Files.isReadable(Paths.get(path))) {
            logger.error("File is not readable");
            throw new CustomException("File is not readable");
        }
    }
}
