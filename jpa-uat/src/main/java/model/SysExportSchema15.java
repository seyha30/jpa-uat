package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SYS_EXPORT_SCHEMA_15 database table.
 * 
 */
@Entity
@Table(name="SYS_EXPORT_SCHEMA_15")
@NamedQuery(name="SysExportSchema15.findAll", query="SELECT s FROM SysExportSchema15 s")
public class SysExportSchema15 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ABORT_STEP")
	private BigDecimal abortStep;

	@Column(name="ANCESTOR_PROCESS_ORDER")
	private BigDecimal ancestorProcessOrder;

	@Column(name="BASE_OBJECT_NAME")
	private String baseObjectName;

	@Column(name="BASE_OBJECT_SCHEMA")
	private String baseObjectSchema;

	@Column(name="BASE_OBJECT_TYPE")
	private String baseObjectType;

	@Column(name="BASE_PROCESS_ORDER")
	private BigDecimal baseProcessOrder;

	@Column(name="BLOCK_SIZE")
	private BigDecimal blockSize;

	@Column(name="CLUSTER_OK")
	private BigDecimal clusterOk;

	@Column(name="COMPLETED_BYTES")
	private BigDecimal completedBytes;

	@Column(name="COMPLETED_ROWS")
	private BigDecimal completedRows;

	@Column(name="COMPLETION_TIME")
	private Object completionTime;

	@Column(name="CONTROL_QUEUE")
	private String controlQueue;

	@Column(name="CREATION_LEVEL")
	private BigDecimal creationLevel;

	@Column(name="CUMULATIVE_TIME")
	private BigDecimal cumulativeTime;

	@Column(name="DATA_BUFFER_SIZE")
	private BigDecimal dataBufferSize;

	@Column(name="DATA_IO")
	private BigDecimal dataIo;

	@Column(name="DATAOBJ_NUM")
	private BigDecimal dataobjNum;

	@Column(name="DB_VERSION")
	private String dbVersion;

	private BigDecimal degree;

	@Column(name="DOMAIN_PROCESS_ORDER")
	private BigDecimal domainProcessOrder;

	@Column(name="DUMP_ALLOCATION")
	private BigDecimal dumpAllocation;

	@Column(name="DUMP_FILEID")
	private BigDecimal dumpFileid;

	@Column(name="DUMP_LENGTH")
	private BigDecimal dumpLength;

	@Column(name="DUMP_ORIG_LENGTH")
	private BigDecimal dumpOrigLength;

	@Column(name="DUMP_POSITION")
	private BigDecimal dumpPosition;

	private BigDecimal duplicate;

	@Column(name="ELAPSED_TIME")
	private BigDecimal elapsedTime;

	@Column(name="ERROR_COUNT")
	private BigDecimal errorCount;

	@Column(name="EXTEND_SIZE")
	private BigDecimal extendSize;

	@Column(name="FILE_MAX_SIZE")
	private BigDecimal fileMaxSize;

	@Column(name="FILE_NAME")
	private String fileName;

	@Column(name="FILE_TYPE")
	private BigDecimal fileType;

	private BigDecimal flags;

	private String grantor;

	private BigDecimal granules;

	private byte[] guid;

	@Column(name="IN_PROGRESS")
	private String inProgress;

	@Column(name="\"INSTANCE\"")
	private String instance;

	@Column(name="INSTANCE_ID")
	private BigDecimal instanceId;

	@Column(name="IS_DEFAULT")
	private BigDecimal isDefault;

	@Column(name="JOB_MODE")
	private String jobMode;

	@Column(name="JOB_VERSION")
	private String jobVersion;

	@Column(name="LAST_FILE")
	private BigDecimal lastFile;

	@Column(name="LAST_UPDATE")
	private Object lastUpdate;

	@Column(name="LOAD_METHOD")
	private BigDecimal loadMethod;

	@Column(name="METADATA_BUFFER_SIZE")
	private BigDecimal metadataBufferSize;

	@Column(name="METADATA_IO")
	private BigDecimal metadataIo;

	private String name;

	@Column(name="OBJECT_INT_OID")
	private String objectIntOid;

	@Column(name="OBJECT_LONG_NAME")
	private String objectLongName;

	@Column(name="OBJECT_NAME")
	private String objectName;

	@Column(name="OBJECT_NUMBER")
	private BigDecimal objectNumber;

	@Column(name="OBJECT_PATH_SEQNO")
	private BigDecimal objectPathSeqno;

	@Column(name="OBJECT_ROW")
	private BigDecimal objectRow;

	@Column(name="OBJECT_SCHEMA")
	private String objectSchema;

	@Column(name="OBJECT_TABLESPACE")
	private String objectTablespace;

	@Column(name="OBJECT_TYPE")
	private String objectType;

	@Column(name="OBJECT_TYPE_PATH")
	private String objectTypePath;

	@Column(name="OLD_VALUE")
	private String oldValue;

	@Column(name="\"OPERATION\"")
	private String operation;

	@Column(name="ORIGINAL_OBJECT_NAME")
	private String originalObjectName;

	@Column(name="ORIGINAL_OBJECT_SCHEMA")
	private String originalObjectSchema;

	@Column(name="PACKET_NUMBER")
	private BigDecimal packetNumber;

	private BigDecimal parallelization;

	@Column(name="PARENT_PROCESS_ORDER")
	private BigDecimal parentProcessOrder;

	@Column(name="PARTITION_NAME")
	private String partitionName;

	private BigDecimal phase;

	private String platform;

	@Column(name="PROCESS_NAME")
	private String processName;

	@Column(name="PROCESS_ORDER")
	private BigDecimal processOrder;

	@Column(name="PROCESSING_STATE")
	private String processingState;

	@Column(name="PROCESSING_STATUS")
	private String processingStatus;

	private BigDecimal property;

	@Column(name="QUEUE_TABNUM")
	private BigDecimal queueTabnum;

	@Column(name="REMOTE_LINK")
	private String remoteLink;

	@Column(name="\"SCN\"")
	private BigDecimal scn;

	private BigDecimal seed;

	@Column(name="SERVICE_NAME")
	private String serviceName;

	@Column(name="SIZE_ESTIMATE")
	private BigDecimal sizeEstimate;

	@Column(name="START_TIME")
	private Object startTime;

	@Column(name="\"STATE\"")
	private String state;

	@Column(name="STATUS_QUEUE")
	private String statusQueue;

	@Column(name="SUBPARTITION_NAME")
	private String subpartitionName;

	private String timezone;

	@Column(name="TOTAL_BYTES")
	private BigDecimal totalBytes;

	private BigDecimal trigflag;

	@Column(name="UNLOAD_METHOD")
	private BigDecimal unloadMethod;

	@Column(name="USER_DIRECTORY")
	private String userDirectory;

	@Column(name="USER_FILE_NAME")
	private String userFileName;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="VALUE_N")
	private BigDecimal valueN;

	@Column(name="VALUE_T")
	private String valueT;

	@Column(name="\"VERSION\"")
	private BigDecimal version;

	@Column(name="WORK_ITEM")
	private String workItem;

	@Lob
	@Column(name="XML_CLOB")
	private String xmlClob;

	public SysExportSchema15() {
	}

	public BigDecimal getAbortStep() {
		return this.abortStep;
	}

	public void setAbortStep(BigDecimal abortStep) {
		this.abortStep = abortStep;
	}

	public BigDecimal getAncestorProcessOrder() {
		return this.ancestorProcessOrder;
	}

	public void setAncestorProcessOrder(BigDecimal ancestorProcessOrder) {
		this.ancestorProcessOrder = ancestorProcessOrder;
	}

	public String getBaseObjectName() {
		return this.baseObjectName;
	}

	public void setBaseObjectName(String baseObjectName) {
		this.baseObjectName = baseObjectName;
	}

	public String getBaseObjectSchema() {
		return this.baseObjectSchema;
	}

	public void setBaseObjectSchema(String baseObjectSchema) {
		this.baseObjectSchema = baseObjectSchema;
	}

	public String getBaseObjectType() {
		return this.baseObjectType;
	}

	public void setBaseObjectType(String baseObjectType) {
		this.baseObjectType = baseObjectType;
	}

	public BigDecimal getBaseProcessOrder() {
		return this.baseProcessOrder;
	}

	public void setBaseProcessOrder(BigDecimal baseProcessOrder) {
		this.baseProcessOrder = baseProcessOrder;
	}

	public BigDecimal getBlockSize() {
		return this.blockSize;
	}

	public void setBlockSize(BigDecimal blockSize) {
		this.blockSize = blockSize;
	}

	public BigDecimal getClusterOk() {
		return this.clusterOk;
	}

	public void setClusterOk(BigDecimal clusterOk) {
		this.clusterOk = clusterOk;
	}

	public BigDecimal getCompletedBytes() {
		return this.completedBytes;
	}

	public void setCompletedBytes(BigDecimal completedBytes) {
		this.completedBytes = completedBytes;
	}

	public BigDecimal getCompletedRows() {
		return this.completedRows;
	}

	public void setCompletedRows(BigDecimal completedRows) {
		this.completedRows = completedRows;
	}

	public Object getCompletionTime() {
		return this.completionTime;
	}

	public void setCompletionTime(Object completionTime) {
		this.completionTime = completionTime;
	}

	public String getControlQueue() {
		return this.controlQueue;
	}

	public void setControlQueue(String controlQueue) {
		this.controlQueue = controlQueue;
	}

	public BigDecimal getCreationLevel() {
		return this.creationLevel;
	}

	public void setCreationLevel(BigDecimal creationLevel) {
		this.creationLevel = creationLevel;
	}

	public BigDecimal getCumulativeTime() {
		return this.cumulativeTime;
	}

	public void setCumulativeTime(BigDecimal cumulativeTime) {
		this.cumulativeTime = cumulativeTime;
	}

	public BigDecimal getDataBufferSize() {
		return this.dataBufferSize;
	}

	public void setDataBufferSize(BigDecimal dataBufferSize) {
		this.dataBufferSize = dataBufferSize;
	}

	public BigDecimal getDataIo() {
		return this.dataIo;
	}

	public void setDataIo(BigDecimal dataIo) {
		this.dataIo = dataIo;
	}

	public BigDecimal getDataobjNum() {
		return this.dataobjNum;
	}

	public void setDataobjNum(BigDecimal dataobjNum) {
		this.dataobjNum = dataobjNum;
	}

	public String getDbVersion() {
		return this.dbVersion;
	}

	public void setDbVersion(String dbVersion) {
		this.dbVersion = dbVersion;
	}

	public BigDecimal getDegree() {
		return this.degree;
	}

	public void setDegree(BigDecimal degree) {
		this.degree = degree;
	}

	public BigDecimal getDomainProcessOrder() {
		return this.domainProcessOrder;
	}

	public void setDomainProcessOrder(BigDecimal domainProcessOrder) {
		this.domainProcessOrder = domainProcessOrder;
	}

	public BigDecimal getDumpAllocation() {
		return this.dumpAllocation;
	}

	public void setDumpAllocation(BigDecimal dumpAllocation) {
		this.dumpAllocation = dumpAllocation;
	}

	public BigDecimal getDumpFileid() {
		return this.dumpFileid;
	}

	public void setDumpFileid(BigDecimal dumpFileid) {
		this.dumpFileid = dumpFileid;
	}

	public BigDecimal getDumpLength() {
		return this.dumpLength;
	}

	public void setDumpLength(BigDecimal dumpLength) {
		this.dumpLength = dumpLength;
	}

	public BigDecimal getDumpOrigLength() {
		return this.dumpOrigLength;
	}

	public void setDumpOrigLength(BigDecimal dumpOrigLength) {
		this.dumpOrigLength = dumpOrigLength;
	}

	public BigDecimal getDumpPosition() {
		return this.dumpPosition;
	}

	public void setDumpPosition(BigDecimal dumpPosition) {
		this.dumpPosition = dumpPosition;
	}

	public BigDecimal getDuplicate() {
		return this.duplicate;
	}

	public void setDuplicate(BigDecimal duplicate) {
		this.duplicate = duplicate;
	}

	public BigDecimal getElapsedTime() {
		return this.elapsedTime;
	}

	public void setElapsedTime(BigDecimal elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public BigDecimal getErrorCount() {
		return this.errorCount;
	}

	public void setErrorCount(BigDecimal errorCount) {
		this.errorCount = errorCount;
	}

	public BigDecimal getExtendSize() {
		return this.extendSize;
	}

	public void setExtendSize(BigDecimal extendSize) {
		this.extendSize = extendSize;
	}

	public BigDecimal getFileMaxSize() {
		return this.fileMaxSize;
	}

	public void setFileMaxSize(BigDecimal fileMaxSize) {
		this.fileMaxSize = fileMaxSize;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public BigDecimal getFileType() {
		return this.fileType;
	}

	public void setFileType(BigDecimal fileType) {
		this.fileType = fileType;
	}

	public BigDecimal getFlags() {
		return this.flags;
	}

	public void setFlags(BigDecimal flags) {
		this.flags = flags;
	}

	public String getGrantor() {
		return this.grantor;
	}

	public void setGrantor(String grantor) {
		this.grantor = grantor;
	}

	public BigDecimal getGranules() {
		return this.granules;
	}

	public void setGranules(BigDecimal granules) {
		this.granules = granules;
	}

	public byte[] getGuid() {
		return this.guid;
	}

	public void setGuid(byte[] guid) {
		this.guid = guid;
	}

	public String getInProgress() {
		return this.inProgress;
	}

	public void setInProgress(String inProgress) {
		this.inProgress = inProgress;
	}

	public String getInstance() {
		return this.instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public BigDecimal getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(BigDecimal instanceId) {
		this.instanceId = instanceId;
	}

	public BigDecimal getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(BigDecimal isDefault) {
		this.isDefault = isDefault;
	}

	public String getJobMode() {
		return this.jobMode;
	}

	public void setJobMode(String jobMode) {
		this.jobMode = jobMode;
	}

	public String getJobVersion() {
		return this.jobVersion;
	}

	public void setJobVersion(String jobVersion) {
		this.jobVersion = jobVersion;
	}

	public BigDecimal getLastFile() {
		return this.lastFile;
	}

	public void setLastFile(BigDecimal lastFile) {
		this.lastFile = lastFile;
	}

	public Object getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Object lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public BigDecimal getLoadMethod() {
		return this.loadMethod;
	}

	public void setLoadMethod(BigDecimal loadMethod) {
		this.loadMethod = loadMethod;
	}

	public BigDecimal getMetadataBufferSize() {
		return this.metadataBufferSize;
	}

	public void setMetadataBufferSize(BigDecimal metadataBufferSize) {
		this.metadataBufferSize = metadataBufferSize;
	}

	public BigDecimal getMetadataIo() {
		return this.metadataIo;
	}

	public void setMetadataIo(BigDecimal metadataIo) {
		this.metadataIo = metadataIo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjectIntOid() {
		return this.objectIntOid;
	}

	public void setObjectIntOid(String objectIntOid) {
		this.objectIntOid = objectIntOid;
	}

	public String getObjectLongName() {
		return this.objectLongName;
	}

	public void setObjectLongName(String objectLongName) {
		this.objectLongName = objectLongName;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public BigDecimal getObjectNumber() {
		return this.objectNumber;
	}

	public void setObjectNumber(BigDecimal objectNumber) {
		this.objectNumber = objectNumber;
	}

	public BigDecimal getObjectPathSeqno() {
		return this.objectPathSeqno;
	}

	public void setObjectPathSeqno(BigDecimal objectPathSeqno) {
		this.objectPathSeqno = objectPathSeqno;
	}

	public BigDecimal getObjectRow() {
		return this.objectRow;
	}

	public void setObjectRow(BigDecimal objectRow) {
		this.objectRow = objectRow;
	}

	public String getObjectSchema() {
		return this.objectSchema;
	}

	public void setObjectSchema(String objectSchema) {
		this.objectSchema = objectSchema;
	}

	public String getObjectTablespace() {
		return this.objectTablespace;
	}

	public void setObjectTablespace(String objectTablespace) {
		this.objectTablespace = objectTablespace;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getObjectTypePath() {
		return this.objectTypePath;
	}

	public void setObjectTypePath(String objectTypePath) {
		this.objectTypePath = objectTypePath;
	}

	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOriginalObjectName() {
		return this.originalObjectName;
	}

	public void setOriginalObjectName(String originalObjectName) {
		this.originalObjectName = originalObjectName;
	}

	public String getOriginalObjectSchema() {
		return this.originalObjectSchema;
	}

	public void setOriginalObjectSchema(String originalObjectSchema) {
		this.originalObjectSchema = originalObjectSchema;
	}

	public BigDecimal getPacketNumber() {
		return this.packetNumber;
	}

	public void setPacketNumber(BigDecimal packetNumber) {
		this.packetNumber = packetNumber;
	}

	public BigDecimal getParallelization() {
		return this.parallelization;
	}

	public void setParallelization(BigDecimal parallelization) {
		this.parallelization = parallelization;
	}

	public BigDecimal getParentProcessOrder() {
		return this.parentProcessOrder;
	}

	public void setParentProcessOrder(BigDecimal parentProcessOrder) {
		this.parentProcessOrder = parentProcessOrder;
	}

	public String getPartitionName() {
		return this.partitionName;
	}

	public void setPartitionName(String partitionName) {
		this.partitionName = partitionName;
	}

	public BigDecimal getPhase() {
		return this.phase;
	}

	public void setPhase(BigDecimal phase) {
		this.phase = phase;
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public BigDecimal getProcessOrder() {
		return this.processOrder;
	}

	public void setProcessOrder(BigDecimal processOrder) {
		this.processOrder = processOrder;
	}

	public String getProcessingState() {
		return this.processingState;
	}

	public void setProcessingState(String processingState) {
		this.processingState = processingState;
	}

	public String getProcessingStatus() {
		return this.processingStatus;
	}

	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}

	public BigDecimal getProperty() {
		return this.property;
	}

	public void setProperty(BigDecimal property) {
		this.property = property;
	}

	public BigDecimal getQueueTabnum() {
		return this.queueTabnum;
	}

	public void setQueueTabnum(BigDecimal queueTabnum) {
		this.queueTabnum = queueTabnum;
	}

	public String getRemoteLink() {
		return this.remoteLink;
	}

	public void setRemoteLink(String remoteLink) {
		this.remoteLink = remoteLink;
	}

	public BigDecimal getScn() {
		return this.scn;
	}

	public void setScn(BigDecimal scn) {
		this.scn = scn;
	}

	public BigDecimal getSeed() {
		return this.seed;
	}

	public void setSeed(BigDecimal seed) {
		this.seed = seed;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public BigDecimal getSizeEstimate() {
		return this.sizeEstimate;
	}

	public void setSizeEstimate(BigDecimal sizeEstimate) {
		this.sizeEstimate = sizeEstimate;
	}

	public Object getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Object startTime) {
		this.startTime = startTime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatusQueue() {
		return this.statusQueue;
	}

	public void setStatusQueue(String statusQueue) {
		this.statusQueue = statusQueue;
	}

	public String getSubpartitionName() {
		return this.subpartitionName;
	}

	public void setSubpartitionName(String subpartitionName) {
		this.subpartitionName = subpartitionName;
	}

	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public BigDecimal getTotalBytes() {
		return this.totalBytes;
	}

	public void setTotalBytes(BigDecimal totalBytes) {
		this.totalBytes = totalBytes;
	}

	public BigDecimal getTrigflag() {
		return this.trigflag;
	}

	public void setTrigflag(BigDecimal trigflag) {
		this.trigflag = trigflag;
	}

	public BigDecimal getUnloadMethod() {
		return this.unloadMethod;
	}

	public void setUnloadMethod(BigDecimal unloadMethod) {
		this.unloadMethod = unloadMethod;
	}

	public String getUserDirectory() {
		return this.userDirectory;
	}

	public void setUserDirectory(String userDirectory) {
		this.userDirectory = userDirectory;
	}

	public String getUserFileName() {
		return this.userFileName;
	}

	public void setUserFileName(String userFileName) {
		this.userFileName = userFileName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigDecimal getValueN() {
		return this.valueN;
	}

	public void setValueN(BigDecimal valueN) {
		this.valueN = valueN;
	}

	public String getValueT() {
		return this.valueT;
	}

	public void setValueT(String valueT) {
		this.valueT = valueT;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public String getWorkItem() {
		return this.workItem;
	}

	public void setWorkItem(String workItem) {
		this.workItem = workItem;
	}

	public String getXmlClob() {
		return this.xmlClob;
	}

	public void setXmlClob(String xmlClob) {
		this.xmlClob = xmlClob;
	}

}