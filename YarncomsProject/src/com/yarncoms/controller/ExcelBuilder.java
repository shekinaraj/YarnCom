package com.yarncoms.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.yarncoms.model.YarnBase;

/**
 * This class builds an Excel spreadsheet document using Apache POI library.
 * 
 * @author www.codejava.net
 *
 */
public class ExcelBuilder extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// get data model which is passed by the Spring container
		List<YarnBase> listBooks = (List<YarnBase>) model.get("listBooks");

		// change the file name "attachment; filename=\"my-xls-file.xls\""
		String fana = "HI";
		response.setHeader("Content-Disposition", "attachment; filename=\"" + fana + "\"");

		// create a new Excel sheet
		HSSFSheet sheet = workbook.createSheet("Java Books");
		sheet.setDefaultColumnWidth(30);

		// create style for header cells
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Arial");
		style.setFillForegroundColor(HSSFColor.BLUE.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setColor(HSSFColor.WHITE.index);
		 style.setFont(font);

		// create header row
		HSSFRow header = sheet.createRow(0);

		header.createCell(0).setCellValue("enquiryId");
		header.getCell(0).setCellStyle(style);

		header.createCell(1).setCellValue("enquiryFrom");
		header.getCell(1).setCellStyle(style);

		header.createCell(2).setCellValue("enquiryFor");
		header.getCell(2).setCellStyle(style);

		header.createCell(3).setCellValue("brand");
		header.getCell(3).setCellStyle(style);

		header.createCell(4).setCellValue("companyName");
		header.getCell(4).setCellStyle(style);

		header.createCell(5).setCellValue("contactPersonName");
		header.getCell(5).setCellStyle(style);

		header.createCell(6).setCellValue("contactPersonEmail");
		header.getCell(6).setCellStyle(style);

		header.createCell(7).setCellValue("countryCode");
		header.getCell(7).setCellStyle(style);

		header.createCell(8).setCellValue("contactNo");
		header.getCell(8).setCellStyle(style);

		header.createCell(9).setCellValue("technicalPerson");
		header.getCell(9).setCellStyle(style);

		header.createCell(10).setCellValue("enqDate");
		header.getCell(10).setCellStyle(style);

		header.createCell(11).setCellValue("enqLevel");
		header.getCell(11).setCellStyle(style);

		header.createCell(12).setCellValue("enqStatus");
		header.getCell(12).setCellStyle(style);

		header.createCell(13).setCellValue("reasonforClosing");
		header.getCell(13).setCellStyle(style);

		header.createCell(14).setCellValue("count");
		header.getCell(14).setCellStyle(style);

		header.createCell(15).setCellValue("warpCount");
		header.getCell(15).setCellStyle(style);

		header.createCell(16).setCellValue("weftCount");
		header.getCell(16).setCellStyle(style);

		header.createCell(17).setCellValue("productDescription");
		header.getCell(17).setCellStyle(style);

		header.createCell(18).setCellValue("remarks");
		header.getCell(18).setCellStyle(style);

		// create data rows
		int rowCount = 1;

		for (YarnBase aBook : listBooks) {
			HSSFRow aRow = sheet.createRow(rowCount++);
			/*aRow.createCell(0).setCellValue(aBook.getEnquiryId());
			aRow.createCell(1).setCellValue(aBook.getEnquiryFrom());
			aRow.createCell(2).setCellValue(aBook.getEnquiryFor());
			aRow.createCell(3).setCellValue(aBook.getBrand());
			aRow.createCell(4).setCellValue(aBook.getCompanyName());
			aRow.createCell(5).setCellValue(aBook.getContactPersonName());
			aRow.createCell(6).setCellValue(aBook.getContactPersonEmail());
			aRow.createCell(7).setCellValue(aBook.getCountryCode());
			aRow.createCell(8).setCellValue(aBook.getContactNo());
			aRow.createCell(9).setCellValue(aBook.getTechnicalPerson());
			aRow.createCell(10).setCellValue(aBook.getEnqDate());
			aRow.createCell(11).setCellValue(aBook.getEnqStatus());
			aRow.createCell(12).setCellValue(aBook.getEnqLevel());
			aRow.createCell(13).setCellValue(aBook.getReasonforClosing());
			aRow.createCell(14).setCellValue(aBook.getCount());
			aRow.createCell(15).setCellValue(aBook.getWarpCount());
			aRow.createCell(16).setCellValue(aBook.getWeftCount());
			aRow.createCell(17).setCellValue(aBook.getProductDescription());
			aRow.createCell(18).setCellValue(aBook.getRemarks());*/
		}
	}

}
