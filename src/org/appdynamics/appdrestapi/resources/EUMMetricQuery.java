/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;

/**
 *
 * @author gilbert.solorzano
 */
public class EUMMetricQuery {
    public static String queryEUM_AJAX_REQUESTS_PER_MIN(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_REQUESTS_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_AJAX_REQUEST_ERRORS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_DOC_DOWNLOAD_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_DOCUMENT_DOWNLOAD_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_DOC_PROCESSING_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_DOCUMENT_PROCESSING_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_END_USER_RESPONSE_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_FIRST_BYTE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /*
     * public static final String EUM_DOCUEMENT_READY_TIME_MS="|Document Ready Time (ms)";
    public static final String EUM_FRONT_END_TIME_MS="|Front End Time (ms)";
    public static final String EUM_PAGE_RENDER_TIME_MS="|Page Render Time (ms)";
    public static final String EUM_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE="|Page views with JavaScript Errors per Minute";
    public static final String EUM_RESPONSE_AVAILABLE_TIME_MS="|Response Available Time (ms)";
    public static final String EUM_SERVER_CONNECTION_TIME_MS="|Server Connection Time (ms)";
    public static final String EUM_SYNTHETIC_REQUESTS_PER_MINUTE="|Synthetic Requests per Minute"
     */
    public static String queryEUM_BASE_PAGES_REQUESTS_PER_MIN(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_REQUESTS_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOC_READY_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOCUEMENT_READY_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOCUMENT_DOWNLOAD_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOCUMENT_PROCESSING_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_FRONT_END_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_FRONT_END_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_PAGE_RENDER_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_RESPONSE_AVAILABLE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_SERVER_CONNECTION_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_SYNTHETIC_REQUESTS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
}
