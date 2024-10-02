package br.com.emiron.builder.complex;

public class ReportConcreteBuilder implements ReportBuilder{

    private String title;
    private String header;
    private String footer;
    private String dataTable;
    private String chart;
    private String summary;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public void setDataTable(String dataTable) {
        this.dataTable = dataTable;
    }

    @Override
    public void setChart(String chart) {
        this.chart = chart;
    }

    @Override
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public Report build() {
        return new Report(this.title, this.header, this.footer, this.dataTable, this.chart, this.summary);
    }
}
