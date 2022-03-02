package java.by.petushokilya.reader.impl;

import java.by.petushokilya.exception.CustomException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArrayReaderImpl implements java.by.petushokilya.reader.ArrayReader {
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
            throw new CustomException(e);
        }
        return list;
    }

    private void cheakFileOfError(String path) throws CustomException {
        if (!Files.exists(Paths.get(path)))
            throw new CustomException("File is not found");

        if (!Files.isReadable(Paths.get(path))) {
            throw new CustomException("File is not readable");
        }
    }
}
