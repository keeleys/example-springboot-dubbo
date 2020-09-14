package cc.sitec.gen;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerator {
    public static final String projectPath = "C:/Users/keeley/IdeaProjects/spring0912/example-service";

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("keeley");
        gc.setOpen(false);
        gc.setFileOverride(true);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);

        mpg.setGlobalConfig(gc);

        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/demo?useUnicode=true&useSSL=false&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("sitec.cc");
        mpg.setDataSource(dsc);

        PackageConfig pc = new PackageConfig();
//        pc.setModuleName("moduleName");
        pc.setParent("cc.sitec.example");
        pc.setEntity("entity");
        pc.setXml("dao");
        pc.setMapper("dao");
        mpg.setPackageInfo(pc);


        TemplateConfig templateConfig = new TemplateConfig();
        // templateConfig.setEntity("templates/entity2.java");
        templateConfig.setService(null);
        templateConfig.setController(null);

        // templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setSuperEntityClass("ParentClass");
        strategy.setEntityLombokModel(false);
        strategy.setRestControllerStyle(true);
//        strategy.setSuperControllerClass("ParentClass");
//        strategy.setSuperEntityColumns("id");
//        strategy.setInclude("table1,table2");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix("t_");
        mpg.setStrategy(strategy);
        mpg.execute();
    }

}
