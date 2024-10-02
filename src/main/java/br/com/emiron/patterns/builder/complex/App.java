package br.com.emiron.builder.complex;

public class App {



    public static void main(String[] args) {
        ReportBuilder builder = new ReportConcreteBuilder();

        ReportDirector reportDirector = new ReportDirector(builder);

        Report marquetingReport = reportDirector.constructMarketingReport();

        System.out.println(marquetingReport.toString());
    }

}
