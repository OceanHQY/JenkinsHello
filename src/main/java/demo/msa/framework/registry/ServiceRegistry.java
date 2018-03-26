package demo.msa.framework.registry;

public interface ServiceRegistry {

	/**
	 * 注册服务信息
	 * @param serviceName
	 * @param serviceAddress
	 */
	void register(String serviceName,String serviceAddress);
}
