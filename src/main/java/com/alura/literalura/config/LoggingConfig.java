package com.alura.literalura.config;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggingConfig {

    /**
     * Clase LoggingConfig.
     * Este constructor configura los niveles de registro al inicializarse.
     */
    public LoggingConfig() {
        // Obtener el contexto de logger utilizando Logback
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

        // Configurar niveles de registro para HikariCP
        Logger hikariLogger = loggerContext.getLogger("com.zaxxer.hikari");
        hikariLogger.setLevel(Level.INFO);
        // Define el nivel INFO para HikariCP, limitando los mensajes a información importante
        // INFO incluye mensajes de información, advertencias y errores

        // Configurar niveles de registro para Hibernate
        Logger hibernateSqlLogger = loggerContext.getLogger("org.hibernate.SQL");
        hibernateSqlLogger.setLevel(Level.INFO);
        // Asigna el nivel INFO a las consultas SQL realizadas por Hibernate
        // Esto incluye únicamente las consultas ejecutadas y niveles superiores

        Logger hibernateBinderLogger = loggerContext.getLogger("org.hibernate.type.descriptor.sql.BasicBinder");
        hibernateBinderLogger.setLevel(Level.WARN);
        // Ajusta el nivel de registro de valores enlazados en consultas SQL a WARN
        // WARN muestra únicamente advertencias y errores críticos

        Logger hibernateHbm2ddlLogger = loggerContext.getLogger("org.hibernate.tool.hbm2ddl");
        hibernateHbm2ddlLogger.setLevel(Level.INFO);
        // Configura el nivel INFO para los logs relacionados con la creación de esquemas de Hibernate
        // Incluye mensajes de información y niveles superiores

        Logger hibernateTransactionLogger = loggerContext.getLogger("org.hibernate.engine.transaction.internal.TransactionImpl");
        hibernateTransactionLogger.setLevel(Level.INFO);
        // Establece INFO como el nivel para transacciones gestionadas por Hibernate
        // Muestra información sobre transacciones y errores

        Logger hibernateConnectionLogger = loggerContext.getLogger("org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl");
        hibernateConnectionLogger.setLevel(Level.INFO);
        // Configura INFO como el nivel de registro para el proveedor de conexiones JDBC en Hibernate
        // Muestra información general y errores relacionados con las conexiones
    }

}
