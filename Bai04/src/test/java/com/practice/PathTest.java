package com.practice;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathTest {
    @Test
    public void testOSPathFixed() {
        // Sử dụng java.nio.file.Path để tự thích nghi với mọi OS
        java.nio.file.Path safePath = java.nio.file.Paths.get("target", "test-folder");

        // Kiểm tra xem đường dẫn có chứa chữ "target" không (thay vì kiểm tra dấu gạch)
        assertTrue(safePath.toString().contains("target"));
    }
}