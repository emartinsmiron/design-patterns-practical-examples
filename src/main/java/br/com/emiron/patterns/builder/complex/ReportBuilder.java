package br.com.emiron.builder.complex;

public interface ReportBuilder {
    void setTitle(String title);
    void setHeader(String header);
    void setFooter(String footer);
    void setDataTable(String dataTable);
    void setChart(String chart);
    void setSummary(String summary);
    Report build();
}
