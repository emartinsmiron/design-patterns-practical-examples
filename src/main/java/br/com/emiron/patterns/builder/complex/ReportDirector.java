package br.com.emiron.builder.complex;

public class ReportDirector {

    private ReportBuilder builder;

    public ReportDirector(ReportBuilder builder) {
        this.builder = builder;
    }

    public Report constructFinancialReport() {
        builder.setTitle("Q3 Financial Report");
        builder.setHeader("Company XYZ - Q3 Financial Report");
        builder.setDataTable("Revenue, Expenses, Profit");
        builder.setChart("Bar Chart: Revenue vs. Expenses");
        builder.setSummary("Overall, the company performed well in Q3.");
        builder.setFooter("Report generated on: 2024-10-01");
        return builder.build();
    }

    public Report constructMarketingReport() {
        builder.setTitle("Q3 Marketing Campaign Report");
        builder.setHeader("Marketing Campaign Performance - Q3");
        builder.setDataTable("Campaign, Spend, Clicks, Conversions");
        builder.setChart("Pie Chart: Conversions by Campaign");
        builder.setSummary("The most successful campaign was Campaign A.");
        builder.setFooter("Report generated on: 2024-10-01");
        return builder.build();
    }
}
