package exceldatasample;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;
public class ExceldataSample {
    public static void main(String[] args) {
// Get the file path from project directory
        String path = System.getProperty("user.dir") + "/files/Geetha.xlsx";
        File excelFile = new File(path);
try (FileInputStream fis = new FileInputStream(excelFile);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = workbook.getSheet("Sheet1");

            int rows = sheet.getPhysicalNumberOfRows();
            int cols = sheet.getRow(0).getLastCellNum();

            // Loop through rows and columns
            for (int r = 0; r < rows; r++) {
                XSSFRow row = sheet.getRow(r);

                for (int c = 0; c < cols; c++) {
                    XSSFCell cell = row.getCell(c);

                    if (cell == null) {
                        System.out.print("NULL\t");
                        continue;
                    }

                    CellType cellType = cell.getCellType();

                    switch (cellType) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.print("UNKNOWN\t");
                    }
                }
                // ✅ Print new line after each row
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error reading Excel file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
