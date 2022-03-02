package java.by.petushokilya.reader;

import java.by.petushokilya.exception.CustomException;

import java.util.List;

public interface ArrayReader {
    List<String> readStringFromFile(String path) throws CustomException;
}
