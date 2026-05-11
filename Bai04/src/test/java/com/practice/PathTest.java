package com.practice;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathTest {
    @Test
    public void testOSPath() {
        // Code gây lỗi đường dẫn Windows
        String path = "target\\test-folder";
        File file = new File(path);
        System.out.println("Checking path on: " + System.getProperty("os.name"));
        assertTrue(file.getPath().contains("\\"), "Lỗi: Không tìm thấy dấu gạch chéo ngược!");
    }
}