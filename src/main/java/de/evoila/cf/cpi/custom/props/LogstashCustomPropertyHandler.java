/**
 * 
 */
package de.evoila.cf.cpi.custom.props;

import java.util.Map;

import de.evoila.cf.broker.model.Plan;
import de.evoila.cf.broker.model.ServiceInstance;
import de.evoila.cf.cpi.custom.props.DomainBasedCustomPropertyHandler;

/**
 * @author Johannes Hiemer.
 *
 */
public class LogstashCustomPropertyHandler implements DomainBasedCustomPropertyHandler {
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.evoila.cf.cpi.openstack.custom.props.DomainBasedCustomPropertyHandler#
	 * addDomainBasedCustomProperties(de.evoila.cf.broker.model.Plan,
	 * java.util.Map, java.lang.String)
	 */
	@Override
	public Map<String, String> addDomainBasedCustomProperties(Plan plan, Map<String, String> customProperties,
			ServiceInstance serviceInstance) {
		customProperties.put("es_host", customProperties.get("es_host"));
		
		return customProperties;
	}

}
