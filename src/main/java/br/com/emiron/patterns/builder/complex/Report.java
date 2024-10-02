package br.com.emiron.builder.complex;

public class Report {
    private String title;
    private String header;
    private String footer;
    private String dataTable;
    private String chart;
    private String summary;

    public Report(String title, String header, String footer, String dataTable, String chart, String summary) {
        this.title = title;
        this.header = header;
        this.footer = footer;
        this.dataTable = dataTable;
        this.chart = chart;
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", header='" + header + '\'' +
                ", footer='" + footer + '\'' +
                ", dataTable='" + dataTable + '\'' +
                ", chart='" + chart + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }}
