package PDF;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import Objetos.Filme;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Image;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GerarPDF {

    private String local;
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public void GerarPDF(List<Filme> dados) {
        Document doc = new Document();

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(local + ".pdf"));

            Font ftitulo = new Font(Font.FontFamily.TIMES_ROMAN, 50.0f, Font.BOLD, BaseColor.ORANGE);
            Font fheader = new Font(Font.FontFamily.TIMES_ROMAN, 14.0f, Font.BOLD, BaseColor.BLACK);
            Font fcorpo = new Font(Font.FontFamily.TIMES_ROMAN, 12.0f, Font.NORMAL, BaseColor.BLACK);

            doc.open();
            
            Image img = Image.getInstance("C:\\Users\\yussef.casseb\\Desktop\\pdf\\algar-tecnologia_0.jpg");
            doc.add(img);
            
            Paragraph p = new Paragraph("Relatório", ftitulo);
            p.setAlignment(1);
            doc.add(p);
            p = new Paragraph("   ");
            doc.add(p);
            
            PdfPTable table = new PdfPTable(8);
            table.setWidths(new int[]{8,8,8,8,8,10,8,8});
            table.setWidthPercentage(100);
            
            PdfPCell coluna1 = new PdfPCell(new Paragraph("Nome",fheader));
            PdfPCell coluna2 = new PdfPCell(new Paragraph("Genero",fheader));
            PdfPCell coluna3 = new PdfPCell(new Paragraph("Descrição",fheader));
            PdfPCell coluna4 = new PdfPCell(new Paragraph("Diretor",fheader));
            PdfPCell coluna5 = new PdfPCell(new Paragraph("Estudio",fheader));
            PdfPCell coluna6 = new PdfPCell(new Paragraph("Data de Lançamento",fheader));
            PdfPCell coluna7 = new PdfPCell(new Paragraph("Estoque",fheader));
            PdfPCell coluna8 = new PdfPCell(new Paragraph("Preço",fheader));
            
            table.addCell(coluna1);
            table.addCell(coluna2);
            table.addCell(coluna3);
            table.addCell(coluna4);
            table.addCell(coluna5);
            table.addCell(coluna6);
            table.addCell(coluna7);
            table.addCell(coluna8);
            
            for (Filme a : dados) {
                coluna1 = new PdfPCell(new Paragraph(a.getNome(), fcorpo));
                coluna2 = new PdfPCell(new Paragraph(a.getDescricao(), fcorpo));
                coluna3 = new PdfPCell(new Paragraph(a.getGenero(), fcorpo));
                coluna4 = new PdfPCell(new Paragraph(a.getDiretor(), fcorpo));
                coluna5 = new PdfPCell(new Paragraph(a.getEstudio(), fcorpo));
                coluna6 = new PdfPCell(new Paragraph(a.getData(), fcorpo));
                coluna7 = new PdfPCell(new Paragraph(String.valueOf(a.getQtde()), fcorpo));
                coluna8 = new PdfPCell(new Paragraph(String.valueOf(a.getPreco()), fcorpo));
                table.addCell(coluna1);
                table.addCell(coluna2);
                table.addCell(coluna3);
                table.addCell(coluna4);
                table.addCell(coluna5);
                table.addCell(coluna6);
                table.addCell(coluna7);
                table.addCell(coluna8);
            }
            
            doc.add(table);
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(GerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            doc.close();
        }
        
        try {
            Desktop.getDesktop().open(new File(local + ".pdf"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro ao abrir arquivo");
        }

    }

}
