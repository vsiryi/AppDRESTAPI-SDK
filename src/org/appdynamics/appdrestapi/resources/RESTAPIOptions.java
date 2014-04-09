/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;

/**
 *
 * @author gilbert.solorzano
 */
public class RESTAPIOptions {
    
    private static Options options=new Options();
    
    
    public RESTAPIOptions(){init();}
    
    public static void init(){
        //String controllerURL, String port, boolean ssl, String username, String password, String account
        Option controller = OptionBuilder.withLongOpt(OPTS.CONTROLLER_L).withArgName( OPTS.CONTROLLER_S )
                                .hasArg()
                                .withDescription( OPTS.CONTROLLER_D )
                                .create( OPTS.CONTROLLER_L );
        options.addOption(controller);
        Option port = OptionBuilder.withLongOpt(OPTS.PORT_L).withArgName( OPTS.PORT_S )
                                .hasArg()
                                .withDescription(  OPTS.PORT_D )
                                .create( OPTS.PORT_L );
        options.addOption(port);
        Option account = OptionBuilder.withLongOpt(OPTS.ACCOUNT_L).withArgName( OPTS.ACCOUNT_S )
                                .hasArg()
                                .withDescription( OPTS.ACCOUNT_D )
                                .create( OPTS.ACCOUNT_L );
        options.addOption(account);
        Option username = OptionBuilder.withLongOpt(OPTS.USERNAME_L).withArgName( OPTS.USERNAME_S )
                                .hasArg()
                                .withDescription( OPTS.USERNAME_D )
                                .create( OPTS.USERNAME_L );
        options.addOption(username);
        Option passwd = OptionBuilder.withLongOpt(OPTS.PASSWD_L).withArgName( OPTS.PASSWD_S )
                                .hasArg()
                                .withDescription( OPTS.PASSWD_D )
                                .create( OPTS.PASSWD_L );
        options.addOption(passwd);
        options.addOption(OPTS.SSL_S, OPTS.SSL_L, OPTS.SSL_A, OPTS.SSL_D);
        
    }

    public static Options getOptions() {
        return options;
    }

    public static void setOptions(Options options) {
        RESTAPIOptions.options = options;
    }
    
    
}
