
package org.tek.sharepoint;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Constants {
	private Constants() {
		throw new IllegalStateException(UTILITY_CLASS);
	}

	public static final String WITHDRAW = "WITHDRAW";

	public static final String INJECT = "INJECT";

	public static final String INJECT_CHAR = "I";

	public static final Integer daysForSelection = 7;

	public static final String APPROVE = "APPROVE";

	public static final String REJECT = "REJECT";

	public static final String REJECT_S = "R";

	public static final String ADD_ACTIVE_S = "A";

	public static final String EDIT_S = "E";

	public static final String DELETE_S = "D";

	public static final String RESTORE_S = "R";

	public static final String UPLOAD_S = "U";

	public static final String ADD = "ADD";

	public static final String DELETE = "DELETE";

	public static final String EDIT = "EDIT";

	public static final String Add = "Add";

	public static final String Edit = "Edit";

	public static final String Delete = "Delete";

	public static final String Cancelled = "Cancelled";

	public static final String Restore = "Restore";

	public static final String Approve = "Approve";

	public static final String Reject = "Reject";

	public static final String Upload = "Upload";

	public static final String SUSPENDED = "SUSPENDED";

	public static final String SUSPENDED_S = "S";

	public static final String PENDING_APPROVAL = "PENDING APPROVAL";

	public static final String PENDING_APPROVAL_S = "PA";

	public static final String EMPTY_STRING = "";

	public static final String WITHDRAW_S = "W";

	public static final String FXSWAP = "FX SWAP";

	public static final String CLEAN = "CLEAN";

	public static final String CLEAN_BORROW = "CLEAN BORROWING";

	public static final BigDecimal ONE_MILLION = BigDecimal.valueOf(1000000);

	public static final String MAS_WITHDRAW = "MAS WITHDRAW";

	public static final String MAS_INJECT = "MAS INJECT";

	public static final Integer AUCTION_OBJECT_LENGTH = 4;

	public static final Integer BID_OBJECT_LENGTH = 7;

	public static final Integer HOLDING_OBJECT_LENGTH = 2;

	public static final Integer HOLIDAY_OBJECT_LENGTH = 4;

	public static final Integer BID_UPLOAD_OBJECT_LENGTH = 6;
	
	public static final Integer SORA_COUNTERPARTY_OBJECT_LENGTH = 2;
	
	public static final String STRING_NA = "N.A.";

	public static final String DEST_DIR = "D:\\\\temp\\\\";

	public static final String PD_FILE_NAME = "PD_Sheet.xlsx";

	public static final String REPO = "REPO";

	public static final String REVERSE_FXSWAP = "REV FX SWAP";

	public static final String REVERSE_REPO = "REV REPO";

	public static final String REV_REPO = "Reverse Repo";

	public static final String BORROWING = "BORROWING";

	public static final String LENDING = "CLEAN LENDING";

	public static final String LIMIT_TYPE_LENDING_ST = "LOAN_ST";

	public static final String LIMIT_TYPE_LENDING_LT = "LOAN_LT";

	public static final String LIMIT_TYPE_REPO_LT = "SGSREPO_LT";

	public static final String LIMIT_TYPE_REPO_ST = "SGSREPO_ST";

	public static final String LIMIT_TYPE_REVERSE_SGSREPO_LT = "SGSREPO_LT";

	public static final String LIMIT_TYPE_REVERSE_SGSREPO_ST = "SGSREPO_ST";

	public static final String LIMIT_TYPE_FXSWAP = "FX_SWAP";

	public static final String LIMIT_TYPE_REVERSE_FXSAWAP = "FX_SWAP";

	public static final int FMBS_LIMIT_TYPE_TENOR = 7;

	public static final String LIMIT_TYPE_REVERSE_REPO_ST = "SGSREPO_ST";

	public static final String LIMIT_TYPE_REVERSE_REPO_LT = "SGSREPO_LT";

	public static final String INSTRUMENT_ADD = "INS_ADD";
	
	public static final char INSTRUMENT_STATUS = 'A';

	public static final String INSTRUMENT_EDIT = "INS_EDIT";

	public static final String INSTRUMENT_CONFIG_EDIT = "INS_CONFIG_EDIT";

	public static final String INSTRUMENT_CURRENCYPAIRPRIORITY_EDIT = "INS_CURR_EDIT";

	public static final String UTILITY_CLASS = "Utility Class";

	public static final String COUNTERPARTY_ADD = "CTP_ADD";

	public static final String COUNTERPARTY_EDIT = "CTP_EDIT";

	public static final String COUNTERPARTY_RANK_EDIT = "CTP_RANK_EDIT";

	public static final String COUNTERPARTY_LIMIT_ADD = "CTP_LIMIT_ADD";

	public static final String MEPS_SECURITIES_ADD = "MEPS_SEC_ADD";

	public static final String EAPPS_CLOSINGPRICE_ADD = "EAPPS_CPRICE_ADD";

	public static final String SPOT_RATES_ADD = "SPOT_RATES_ADD";
	
	public static final String OFFERED_RATES_ADD = "OFFERED_RATES_ADD";

	public static final String MEPS_SECURITIES_HOLDING = "MEPS_SEC_HOLDING";

	public static final String CALENDAR_ADD = "CALENDAR_ADD";

	public static final String CALENDAR_EDIT = "CALENDAR_EDIT";

	public static final String CALENDAR_UPLOAD = "CALENDAR_UPLOAD";

	public static final String NOTIFICAITON_ADD = "NOTIFICATION_ADD";

	public static final String COUNTERPARTY_USER_ADD = "CTP_USR_ADD";

	public static final String COUNTERPARTY_USER_EDIT = "CTP_USR_EDIT";

	public static final String UPLOAD_BID = "UPLOAD_BID";

	public static final String LOGIN = "Login";

	public static final String LOGOUT = "Logout";

	public static final String TITLE = "User Access";

	public static final String DOWNLOAD = "Download";
	public static final String AUCTION_RESULTS_DOWNLOAD_SUCCESS_REMARK = "Auction Result file download successful";
	public static final String AUCTION_RESULTS_DOWNLOAD_FAIL_REMARK = "Auction Result file download failed";
	public static final String LOGIN_SUCCESS_REMARK = "Login successful";

	public static final String LOGIN_FAIL_REMARK = "Login failed";

	public static final String LOGOUT_SUCCESS_REMARK = "Logout successful";

	public static final String LOGOUT_FAIL_REMARK = "Logout failed";

	public static final String LOGOUT_SESSION_TIMEOUT_SUCCESS_REMARK = "Auto Logout (Session Timeout)";

	public static final String LOGOUT_SESSION_INVALIDATED_SUCCESS_REMARK = "Auto Logout (Session Limit)";

	public static final String TRADE_ALLOTMENT = "ALLOTMENT_LOG";

	public static final String ALLOTMENT = "Allotment";

	public static final String AWARDED_SECURITY_STATUS_MANUAL_ALLOTTED = "Manual Allotted";

	public static final String CHANGES_LOG_CSV = "ChangesLog.csv";

	public static final String USER_ACCESS_LOG_CSV = "UserAccessLog.csv";

	public static final String TRANS_LOG_CSV = "TransactionsLog.csv";

	public static final String ALLOTMENT_LOG_CSV = "AllotmentLog.csv";
	
	public static final String CHANGES_LOG_PDF = "ChangesLog.pdf";
	
	public static final String USER_ACCESS_LOG_PDF = "UserAccessLog.pdf";
	
	public static final String TRANS_LOG_PDF = "TransactionsLog.pdf";
	
	public static final String ALLOTMENT_LOG_PDF = "AllotmentLog.pdf";
	
	public static final String SORA_STATISTICS_CSV = "SORAStatistics.csv";
	
	public static final String CONSOLIDATED_SORA_TXN_EXCEL = "ConsolidatedSORATransactions.xlsx";
	
	public static final String SUBMIT_SECURITIES = "SUBMIT_SECURITIES";
	
	public static final String DMMO_SETTING_ENABLED = "Y";
	
	public static final String REPO_TYPE = "V";

	public static final String REV_REPO_TYPE = "R";

	public static final String ASC="ASC";

	public static final String DESC = "DESC";

	public static final String REPO_LOWERCASE = "Repo";

	public static final String CLEAN_LENDING_LOWERCASE = "Clean Lending";

	public static final String CLEAN_BORROWING_LOWERCASE = "Clean Borrowing";

	public static final String PRICE_CURRENCY = "priceCcy";
	
	public static final String SORA_SETTING = "SORA_SETTING";
	
	public static final String SORA_TRXN = "SORA_TRXN";
	
	public static final String SORA_MONITOR = "SORA_MONITOR";
	
	public static final String _ADD = "_ADD";
	
	public static final String _EDIT = "_EDIT";
	
	public static final String _VIEW = "_VIEW";
	
	public static final String _REVIEW = "_REVIEW";
	
	public static final String YES = "YES";
	
	public static final String NO = "NO";

	public static final String Y = "Y";

	public static final String N = "N";
	
	public static final String SORA_SETTING_VIEW = SORA_SETTING + "" + _VIEW;
	
	public static final String SORA_SETTING_EDIT = SORA_SETTING + "" + _EDIT;
	
	public static final String SORA_SETTING_REVIEW = SORA_SETTING + "" + _REVIEW;
	
	public static final String SORA_TRXN_ADD = SORA_TRXN + "" + _ADD;
	
	public static final String SORA_TRXN_REVIEW = SORA_TRXN + "" + _REVIEW;
	
	public static final String SORA_MONITOR_VIEW = SORA_MONITOR + "" + _VIEW;
	
	public static final String SORA_MONITOR_REVIEW = SORA_MONITOR + "" + _REVIEW;

	public static final String SYSTEM = "System";
	
	public static final String MONTH = "MONTH";
	
	public static final String SORA = "SORA";

	public static final String SFTP_STATUS_FILENAME = "sora_sftp_status.txt";
	
	public static class MMOCPB_REPORT {
		public static final List<String> GROUP1 = 
			    Collections.unmodifiableList(Arrays.asList("DBS", "UOB", "OCBC"));
		public static final String DBS = "DBS";
		public static final String UOB = "UOB";
		public static final String OCBC = "OCBC";
		public static class TAB_NAME {
			public static final String MMO_CHARTS = "MMO_CHARTS";
			public static final String OUTSTANDING_MMO_WITHDRAW = "OUTSTANDING_MMO_WITHDRAW";
			public static final String OUTSTANDING_MMO_INJECT = "OUTSTANDING_MMO_INJECT";
			public static final String CLEAN_BORROWING = "CLEAN_BORROWING";
			public static final String CLEAN_LENDING = "CLEAN_LENDING";
			public static final String USD_SGD_BUY = "USD_SGD_BUY";
			public static final String USD_SGD_SELL = "USD_SGD_SELL";
			public static final String SGD_CNH_BUY = "SGD_CNH_BUY";
			public static final String SGD_CNH_SELL = "SGD_CNH_SELL";
			public static final String REPO = "REPO";
			public static final String REV_REPO = "REV_REPO";
			
		}
	}
	
	public static class STATUS {
		private STATUS() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String ALLOTTED = "Allotted";
		public static final String NOT_ALLOTTED = "Not Allotted";
		public static final String PENDING = "Pending";
		public static final String EDITED = "Edited";
		public static final String APPROVED = "Approved";
		public static final String REJECTED = "Rejected";
		public static final String CANCELED = "Canceled";
		public static final String DONE = "Done";
		public static final String IN_PROGRESS = "In Progress";
		public static final String AUTO_APPROVED = "Auto-Approved";
		public static final String MANUAL_ALLOTTED ="Manual Allotted";
	}

	public static class STATE {

		public static final String WAITING_FOR_AUCTION = "Waiting For Auction";
		public static final String AUCTION_IN_PROGRESS = "Auction In Progress";
		public static final String WAITING_FOR_RESULTS = "Waiting For Results";
		public static final String RELEASE_RESULTS = "Release Results";
	}

	public static class STATE_ID {
		public static final int WAITING_FOR_AUCTION = 1;
		public static final int RELEASE_RESULTS = 5;
		public static final int COUNTDOWN_TO_AUCTION = 2;
		public static final int AUCTION_IN_PROGRESS = 3;
		public static final int SECURITY_ALLOTMENT = 7;
		public static final int SECURITY_RESULTS_RELEASE = 8;
		public static final int CLOSING = 9;
		public static final int ALLOTMENT_IN_PROGRESS = 4;
	}

	public static class PREFERENCE {
		private PREFERENCE() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String AUTO_SELECTED = "Auto Selected";
		public static final String MAS_SELECTED = "MAS Selected";
	}

	public static class AuctionStatus {
		private AuctionStatus() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String ACTIVE = "A";
		public static final String PENDING = "P";
		public static final String END = "E";
		public static final String CANCEL = "C";
		
		public static final List<String> AUCTION_STATUS_LIST = 
			    Collections.unmodifiableList(Arrays.asList("A", "E"));
		public static final List<String> AUCTION_STATUS_END = 
			    Collections.unmodifiableList(Arrays.asList("E"));
	}
	
	public static class BidStatus {
		private BidStatus() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final char ACTIVE = 'A';
		public static final char VOID = 'V';
		public static final String VOID_STRING = "Void";
		public static final char PENDING_FOR_RE_ALLOT = 'P';
		public static final char EDIT = 'E';
	}

	public static class EditBidStatusValue {
		private EditBidStatusValue() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String PENDING = "Pending";
		public static final String EDIT = "Edited";
	}

	public static class InstrumentType {
		private InstrumentType() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String CLEAN_BORROWING = "CLEAN BORROWING";
		public static final String CLEAN_LENDING = "CLEAN LENDING";
		public static final String REPO = "REPO";
		public static final String REV_REPO = "REV REPO";
		public static final String FX_SWAP = "FX SWAP";
		public static final String REV_FX_SWAP = "REV FX SWAP";

	}

	public static class InterfaceFileStatus {
		private InterfaceFileStatus() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String PENDING = "P";
		public static final String APPROVE = "A";
		public static final String REJECT = "R";
		public static final String FAILED = "F";
	}

	public static class IntefaceChannel {
		private IntefaceChannel() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String MANUAL = "M";
		public static final String AUTO = "A";

	}

	public static class Currency {
		private Currency() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String SGD = "SGD";
		public static final String USD = "USD";
		public static final String CNH = "CNH";
		public static final String SGDCNH = "SGDCNH";
		public static final String USDSGD = "USDSGD";

	}

	public static class ResourceType {
		private ResourceType() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String ADD_EDIT = "AE";
		public static final String VIEW = "V";
		public static final String REVIEW = "R";

	}

	public static class ISSUE_TYPE {
		private ISSUE_TYPE() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String MAS_BILL = "MAS Bill";
		public static final String SG_BONDS = "BN";
		public static final String MAS_BILL_MB = "MB";
		public static final String T_BILL_TB = "TB";
	}

	public static class AUCTION_SETTING {

		public static final String START_END = "AS/AE";
		public static final String CANCEL = "CANCEL";
		public static final String EXTEND = "EXTEND";
		public static final String REOPEN = "REOPEN";
		public static final String AUCTION_CANCEL = "AUCTION_CANCEL";

		public static final String DEFAULT_AUCTION_SETTING = "DEFAULT_AS";
		public static final String AUCTION_CREATE = "AUCTION_CREATE";
	}

	public static class NextLevel {

		public static final String PROCEED = "proceed";
		public static final String ON_HOLD = "on hold";
		public static final String IN_PROGRESS = "in progress";
	}

	public static class ACTION {
		private ACTION() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String EDIT = "Edit";

	}

	public static final String AUCTION_REMARKS = "REPOS ARE ON GC BASIS";

	public static final int ZERO = 0;
	public static final int ONE = 1;

	public static final int TWO = 2;

	public static final int THREE = 3;

	public static final int FOUR = 4;

	public static final int FIVE = 5;

	public static final int SIX = 6;

	public static final int OVERNIGHT = 999;
	
	public static final int auctionCurrentSettingId = 100;

	public static final String INVALID_TENOR_VALUE = "Tenor accepts 3-digit numeric values with “-D” (except for “O/N”)";

	public static final String INVALID_MATURITY_DATE = "Maturity Date must be in DD MMM YYYY format";
	
	public static final String INVALID_NOMINAL_AMOUNT_DECIMAL = "Nominal amount cannot contain decimal";
	
	public static final String INVALID_NOMINAL_AMOUNT = "Invalid Nominal Amount";
	
	public static final String INVALID_NOMINAL_AMOUNT_DENOMINATION = "Nominal Amount must be in denomination of S$ ";
	
	public static final String NOMINAL_AMOUNT_EXCEEDS_5_DIGIT_LENGTH =  "Nominal amount cannot exceed 5 digit";

	public static final String INVALID_SECURITY_HOLDING_AMOUNT = "Total Securities Holdings' Amount is less than the Total Nominal Amount entered for Repo, please update the nominal amount value(s)";

	public static final String INVALID_INSTRUMENT_TYPE_ERROR = "Instrument not found ";

	public static final String FILE_CANNOT_BE_EMPTY = "File cannot be empty or contain an empty line";

	public static final String FILE_MUST_HAVE_VALID_HEADER = "File must have valid headers";

	public static final String FILE_MISSING_HEADER = "File has missing Header";

	public static final String FILE_CONTAINS_INVALID_HEADER = "File contains invalid Header";

	public static final String INVALID_FILE = "Invalid File";

	public static final String HOLIDAY = " is holiday";

	public static final String INVALID_TENOR_MATURITY_DATE = "Invalid tenor and maturity date";

	public static final String USER_ADD = "USER_ADD";

	public static final String USER = "USER";

	public static final String USER_EDIT = "USER_EDIT";

	public static final String INTERNAL_S = "I";

	public static final String UNDER_SCORE = "_";

	public static final String USER_DELETE = "USER_DELETE";

	public static final String REVIEW_S = "R";

	public static final String USER_REVIEW = "USER_REVIEW";

	public static final String USER_GRP_ADD = "USER_GRP_ADD";

	public static final String USER_GRP_EDIT = "USER_GRP_EDIT";

	public static final String USER_GRP_REVIEW = "USER_GRP_REVIEW";
	
	public static final int OVER_NIGHT = 001;
	
	public static final String TENOR_DAY = "D";

	public static class COMMON_PENDING_FUNCTIONS {
		public static final String EDIT_BID = "EDIT_BID";
		public static final String SUBMIT_BID = "SUBMIT_BID";
	}

	public static class COMMON_PENDING_ACTIONS {
		public static final String EDIT = "E";
	}

	public static class MASTER_STATE {

		public static final char PROCESSING = 'P';
		public static final char DONE = 'D';
		public static final char WAITING = 'W';

	}

	public static class MASTER_STATE_ID {

		public static final Integer WAITING_FOR_AUCTION = 1;
		public static final Integer COUNTDOWN_TO_AUCTION = 2;
		public static final Integer AUCTION_IN_PROGRESS = 3;
		public static final Integer ALLOTMENT_IN_PROGRESS = 4;
		public static final Integer ALLOTMENT_RESULTS_RELEASE = 5;
		public static final Integer SECURITY_PREFERENCE_SUBMISSION = 6;
		public static final Integer SECURITY_ALLOTMENT = 7;
		public static final Integer SECURITY_RESULTS_RELEASE = 8;
		public static final Integer CLOSING = 9;
		public static final Integer REV_REPO = 99;
	}

	public static class INTERFACE_STATE_NAME {
		public static final String AUCTION_UPLOAD = "AUCTION_UPLOAD";
		public static final String FMBS_FILE_UPLOAD = "FMBS_FILE_UPLOAD";
		public static final String MEPSPLUS_FILE_UPLOAD = "MEPSPLUS_FILE_UPLOAD";
		public static final String EAPPS_UPLOAD = "EAPPS_UPLOAD";
		public static final String SPOT_RATE_UPDATE = "SPOT_RATE_UPDATE";
	}
	
	public static class REPORT_ID {
		public static final String AUCTION_RESULTS = "AUCTION_RESULTS";
		public static final String TRADE_RESULTS = "TRADE_RESULTS";
		public static final String CP_BIDDING_BEHAVIOUR = "CP_BIDDING_BEHAVIOUR";
		public static final String DAILY_MATURITY_SWAPS = "DAILY_MATURITY_SWAPS";
		public static final String MMO_CP_BEHAVIOUR = "MMO_CP_BEHAVIOUR";
		public static final String MMO_FACT_SHEET = "MMO_FACT_SHEET";
		public static final String ACCESS_RIGHTS_ADHOC_PDF = "ACCESS_RIGHTS_ADHOC_PDF";
		public static final String ACCESS_RIGHTS_ADHOC_XLSX = "ACCESS_RIGHTS_ADHOC_XLSX";
		public static final String ACCESS_RIGHTS_MONTHLY = "ACCESS_RIGHTS_MONTHLY";
		
		public static final String AUDIT_CHANGE_LOG_PDF = "AUDIT_CHANGE_LOG_PDF";
		public static final String AUDIT_USER_ACCESS_PDF = "AUDIT_USER_ACCESS_PDF";
		public static final String AUDIT_TRANSACTION_PDF = "AUDIT_TRANSACTION_PDF";
		public static final String AUDIT_ALLOTMENT_PDF = "AUDIT_ALLOTMENT_PDF";
		public static final String MONTHLY_MMO = "MONTHLY_MMO";
		public static final String EMPTY_REPORT = "EMPTY_REPORT";
		
		public static final String MARKET_DATA_REPORT = "MARKET_DATA_REPORT";
		public static final String MMO_TRANSACTIONS_REPORT = "MMO_TRANSACTIONS_REPORT";
		public static final String MMO_BID_SUMMARY_REPORT = "MMO_BID_SUMMARY_REPORT";
		public static final String CONSOLIDATED_SORA_TXN_REPORT = "CONSOLIDATED_SORA_TXN_REPORT";
		public static final String STATISTICS_HISTORY_REPORT = "STATISTICS_HISTORY_REPORT";
	}
	
	public static class REPORT_KEY {
		public static final String AUCTION_RESULTS_KEY = "MMOAUCTRES";
		public static final String TRADE_RESULTS_KEY = "MMOTRD";
		public static final String CP_BIDDING_BEHAVIOUR_KEY = "CPBID";
		public static final String DAILY_MATURITY_SWAPS_KEY = "DAILYSWAP";
		public static final String MMO_MONTHLY_KEY = "MONMMO";
		public static final String MMO_CP_BEHAVIOUR_KEY = "MMOCPB";
		public static final String MMO_FACT_SHEET_KEY = "MMOFAC";
		public static final String ACCESS_RIGHTS_KEY = "ACSRTS";
		public static final String SORA_KEY = "SORA";
	}
	

	public static class INTERFACE_STATE_STATUS {
		public static final char UPDATED_TODAY = 'T';
		public static final char NOT_UPDATED_TODAY = 'F';
	}

	public static class INTERFACE_STATE_ID {
		public static final Integer AUCTION_UPLOAD_ID = 5;
		public static final Integer FMBS_UPLOAD_ID = 1;
		public static final Integer MEPSPLUS_UPLOAD_ID = 2;
		public static final Integer EAPPS_UPLOAD_ID = 3;
		public static final Integer SPOT_RATE_ID = 4;
	}

	public static class AUCTION_TYPE {
		public static final String MMO = "MMO";
		public static final String DMMO = "DMMO";
	}

	public static class CHANGER {
		public static final String STATE_CHANGE = "STATE_CHANGE";
		public static final String AUCTIONSETTING = "AUCTIONSETTING";
		public static final String TIMER = "TIMER";
		public static final String INITIAL_LOADING = "INITIAL_LOADING";
	}

	public static class BID_ALLOTMENT_STATUS {
		public static final String ALLOTTED = "Allotted";
		public static final String NOT_ALLOTTED = "Not Allotted";
		public static final String NOT_ALLOTTED_LIMIT_BREACH = "Not Allotted Limit Breach";
		public static final String ALLOTTED_MANUAL_OVERRIDE = "ALLOTTED MANUAL OVERRIDE";
		public static final String ALLOTTED_MANUAL_OVERRIDE_LIMIT = "ALLOTTED MANUAL OVERRIDE LIMIT";
		public static final String VOID = "VOID";
		public static final String PARTIAL_ALLOTTED_LIMIT_BREACH = "Partial Allotted Limit Breach ";
		public static final String NOT_SUBMITED = "Not Submitted";
	}

	public static class BID_EDIT_STATUS {
		public static final String MANUAL_OVERRIDE = "E";
		public static final String MANUAL_OVERRIDE_LIMIT = "E";
	}

	public static class BID_EDIT_ALLOTMENT_STATUS_LABEL {
		public static final String ALLOTTED_MANUAL_OVERRIDE = "Allotted Manual Override";
		public static final String ALLOTTED_MANUAL_OVERRIDE_LIMIT = "Allotted Manual Override Limit";
	}

	public static class BID_ALLOTMENT_STATUS_LABEL {
		public static final String ALLOTTED_OVERRIDE_MB_MP = "Allotted (MB,MP)";
		public static final String ALLOTTED_OVERRIDE_ML_MB_MP = "Allotted (ML,MB,MP)";
		public static final String NOT_ALLOTTED_OVERRIDE_MB_MP = "Not Allotted (MB,MP)";
		public static final String NOT_ALLOTTED_OVERRIDE_ML_MB_MP = "Not Allotted (ML,MB,MP)";
		public static final String ALLOTTED_OVERRIDE_ML = "Allotted (ML)";
		public static final String NOT_ALLOTTED_OVERRIDE_ML = "Not Allotted (ML)";
		public static final String NOT_ALLOTTED = "Not Allotted";
		public static final String ALLOTTED = "Allotted";
		public static final String PARTIAL_ALLOTTED_LIMIT_BREACH = "Partial Allotted Limit Breach ";
	}

	public static class FUNCTION {

		public static final String AWARDED_SECURITY_EDIT = "SEC_ALLOTMENT";
		public static final String REV_REPO_SECURITY_EDIT = "SEC_PLEDGE";
	}

	public static class AUCTION_DETAIL {
		public static final String TODAY_AUCTION = "Today's Auction";
		public static final String LAST_AUCTION = "Last Auction";
		public static final String TODAY_AUCTION_S = "Today_Auction";
	}

	public static class TRADE_RESULTS_TRANSACTION_TYPE {
		public static final String FX_SWAP = "S";
		public static final String REV_FX_SWAP = "RS";
		public static final String LENDING = "L";
		public static final String BORROWING = "B";
		public static final String REPO = "R";
		public static final String REV_REPO = "RR";

	}

	public static class BATCH_JOB_STATUS {
		public static final String INPROGRESS = "I";
		public static final String DONE = "D";
		public static final String ERROR = "E";
	}

	public static class BATCH_JOB_ID {
		public static final String FMBS = "FMBS-BATCH";
		public static final String EAPPS = "EAPPS-BATCH";
		public static final String MEPS = "MEPS-BATCH";
		public static final String TRADE_RESULT = "TRADE-RESULT-BATCH";
		public static final String MAF_IDM = "MAFIDM-BATCH";
		public static final String TRADE_ALLOCATION = "TRADE-ALLOCATION-BATCH";
		public static final String SF_RATE = "MASWEB-SF-BATCH";
		public static final String MEPSSF_RATE = "MEPSSF-BATCH";
		public static final String ENDOFDAY_AUCTION_CLOSERUN = "EOD-AUCTIONCLOSERUN-BATCH";
		public static final String DMMO_DEFAULT_SETTING_BATCH = "DMMO-DEFAULTSETTING-BATCH";
		public static final String REPORT_MMOFAC = "MMOFAC-BATCH";
		public static final String REPORT_MONMMO = "MONMMO-BATCH";
		public static final String REPORT_MMOCPB = "MMOCPB-BATCH";
		public static final String REPORT_ACSRTS = "ACSRTS-BATCH";
		public static final String REPORT_MARKETDT_PRELIST = "MARKETDT-PRELIST-BATCH";
		public static final String REPORT_MARKETDT = "MARKETDT-BATCH";
		public static final String MARKETDT_OFFEREDRATE = "MARKETDT-OFFERRATE-BATCH";
		public static final String MARKETDT_SPOTRATE = "MARKETDT-SPOTRATE-BATCH";
		public static final String SORA_CALCULATION = "SORA-CALCULATION-BATCH";
		public static final String SORA_FIRST_PUBLISH = "SORA-FIRST-PUBLISH-BATCH";
		public static final String SORA_REPUBLISH = "SORA-REPUBLISH-BATCH";
		public static final String HOUSEKEEPING = "HOUSEKEEP-BATCH";
		public static final String SORA_EAPPS = "SORA-EAPPS-BATCH";
		public static final String DB_SCRIPT_EXECUTE = "DB-SCRIPTEXECUTE-BATCH";
		public static final String MQ_CONNECTIVITY = "MQ-BATCH";
	}
	
	
	public static class FMBSInstrumentType {
		private FMBSInstrumentType() {
			throw new IllegalStateException(UTILITY_CLASS);
		}
		public static final List<String> CLEAN_LENDING_LIST = 
			    Collections.unmodifiableList(Arrays.asList("LOAN_ST", "LOAN_LT"));
		public static final List<String> ALL_REPO_LIST = 
			    Collections.unmodifiableList(Arrays.asList("SGSREPO_ST", "SGSREPO_LT"));
		public static final List<String> ALL_FX_SWAP_LIST = 
			    Collections.unmodifiableList(Arrays.asList("FX_SWAP"));
	}

	public static class BUTTON_STATUS {
		public static final String ENABLED = "E";
		public static final String DISABLED = "D";

	}

	public static class BUTTON_STATUS_ID {
		public static final int RE_ALLOT_BUTTON_ID = 1;
		public static final int RELEASE_TARDE_RESULTS_BUTTON_ID = 2;
		public static final int EDIT_BID_ID = 3;
	}

	public static class BUTTON_STATUS_NAME {
		public static final String RE_ALLOT = "Re_Allot";
		public static final String RELEASE_TARDE_RESULTS = "Release_trade_Results";
		public static final String EDIT_BID = "Edit_Bid";
	}

	public static class SEQUENCE_TYPE {

		public static final String CHANGES_LOG = "C";
		public static final String USERACCESS_LOG = "U";
		public static final String TRANSACTION_LOG = "T";
		public static final String ALLOTMENT_LOG = "A";
	}

	public static class RECORD {

		public static final String CURRENT_AUCTION = "Current Auction";
		public static final String DEFAULT_SETTING = "Default Setting";
		public static final String AUCTION_EXTEND = "Extend Auction";
		public static final String AUCTION_REOPEN = "Re-open Auction";
		public static final String AUCTION_CANCEL = "Cancel Auction";
	}

	public static class FUNCTION_NAME {

		public static final String Counterparties = "Counterparties";
		public static final String Calendar = "Calendar";
		public static final String MMOUsers = "MMO Users";
		public static final String CounterpartyUsers = "Counterparty Users";
		public static final String Instruments = "Instruments";
		public static final String MMOUserGroups = "MMO User Groups";
		public static final String AuctionSetting = "Auction Settings";
		public static final String ReAllotment = "Re-Allotment";
		public static final String UpdateSecuritySelection = "Securities Allotment";
		public static final String SpotRates = "Spot Rates";
		public static final String CounterpartyLimits = "Counterparty Limits";
		public static final String SGSecurities = "Securities Holdings";
		public static final String HoldingAmounts = "Holding Amounts";
		public static final String ClosingPrices = "Closing Prices";
		public static final String UploadBids = "Upload Bids";
		public static final String Contingencies = "Contingencies";
		public static final String Notifications = "Notifications";
		public static final String CreateAnnouncement = "Create Announcement";
		public static final String OfferedRates = "Offered Rates";
		public static final String UpdateSecurityPledge = "Securities Pledge";
		public static final String MarketDataReport = "Market Data Report";
		public static final String SoraSetting = "SORA Setting";
		
		public static final String MASUserGroups = "MAS User Groups";
		public static final String MASUsers = "MAS Users";
		public static final String UserGroups = "User Groups";
		public static final String SoraTransactions = "SORA Transactions";
		public static final String SoraMonitorRepublication = "SORA Monitor/Republication";
		
	}

	public static class COUNTRY_NAME {

		public static final String SGD = "Singapore";
		public static final String USD = "United States of America";
		public static final String AUD = "Australia";
		public static final String CAD = "Canada";
		public static final String EUR = "European Union";
		public static final String JPY = "Japan";
		public static final String CNH = "China";
		public static final String DKK = "Denmark";
		public static final String NZD = "New Zealand";
		public static final String NOK = "Norway";
		public static final String GBP = "United Kingdom";
		public static final String SEK = "Sweden";
		public static final String CHF = "Switzerland";
	}

	public static class REVIEW_ACTION {
		public static final String Extend = "Extend";
		public static final String Reopen = "Re-open";
		public static final String Cancel = "Cancel";
		public static final String Reopen_S = "R";
		public static final String Cancel_S = "C";
	}

	public static class MEPSSF_RATE {
		public static final String DELIMITER = "|";
		public static final String DEPO = "SFD";
		public static final String REPO = "SFB";
		public static final String DEPOSIT = "DEPO";
		public static final String BORROW = "REPO";
	}

	public static class InterfaceFileKey {
		private InterfaceFileKey() {
			throw new IllegalStateException(UTILITY_CLASS);
		}

		public static final String EAPPS_INCOMING = "ICPEAPPS";
		public static final String FMBS_INCOMING = "ICPLFMBS";
		public static final String MEPS_INCOMING = "IMEPS";
		public static final String MEPS_DOUTGOING = "ODMEPS";
		public static final String MEPS_ROUTGOING = "OBMEPS";
		public static final String FMBS_OUTGOING = "ORESFMBS";
		public static final String MEPS_HOLDINGINCOMING = "IMEPSHOL";
		public static final String HOLIDAYS_INCOMING = "IHOLIDAY";
		public static final String CP_OUTGOING = "ORESCP";
		public static final String SORA_EAPPS_OUTGOING = "OSORAEAPPS";
	}

	public static class BENCHMARK_TENOR {
		public static final int OVER_NIGHT = 999;
		public static final int ONE_WEEK_START = 5;
		public static final int ONE_WEEK_END = 9;
		public static final int ONE_MONTH_START = 5;
		public static final int ONE_MONTH_END = 9;
		public static final int TWO_MONTH_START = 53;
		public static final int TWO_MONTH_END = 67;
		public static final int THREE_MONTH_START = 80;
		public static final int THREE_MONTH_END = 100;
		public static final int SIX_MONTH_START = 165;
		public static final int SIX_MONTH_END = 195;

	}

	public static class BENCHMARK_TENDOR_DAYS {

		public static final String OVER_NIGHT = "O/N";
		public static final String ONE_WEEK = "1-W";
		public static final String TWO_MONTH = "2-M";
		public static final String THREE_MONTH = "3-M";
		public static final String SIX_MONTH = "6-M";

	}

	public static class BENCHMARK_CHANGE_STATUS {
		public static final String INCREASED = "yes";
		public static final String DECREASED = "no";
		public static final String EQUAL = "equal";
		public static final String NO_CALCULATION = "nocalc";
	}

	public static class UPLOAD_FILENAME {
		public static final String MEPS_SEC_HOLDING = "holdings.xlsx";
		public static final String MEPS_SEC = "holdings_ammo.csv";
		public static final String FMBS = "MMO_Counterparty_Limits.csv";
		public static final String CLOSING_PRICE = "closingprice_ammo.txt";
	}

	public static class TENDOR_PERIOD_STATUS {
		public static final String ACTIVE = "A";
		public static final String INACTIVE = "I";
	}

	public static class REPORT_TYPE_STATUS {
		public static final char ACTIVE = 'A';
		public static final char INACTIVE = 'I';
	}

	public static class TRADE_ALLOTMENT_BY {
		public static final String SYSTEM_ALLOTTED = "System Allotted";
		public static final String RE_ALLOTTED = "Re-Allotted";
		public static final String RELEASED = "Released";
	}

	public static final String SPRING_EXCEL_CONTENT_TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	public static final String TIKA_EXCEL_CONTENT_TYPE = "application/x-tika-ooxml";
	public static final String TIKA_CSV_TXT_CONTENT_TYPE = "text/plain";
	
	public static class NOTIFICATION_TYPE {
		public static final char PD = 'P';
		public static final char ACTION = 'A';
	}

	public static class BORROWING_ON_RESPONSE_MESSAGES {
		public static final String HEADER_MSG = "SF Rates are not available";
		public static final String BODY_MSG_ONE = "The following files are not created:";
		public static final String BODY_MSG_TWO = "SF Deposit Rates and Repo Borrowing Rates";
	}

	public static class LOGOUT_TYPE {
		public static final String USER_MANNUALLY_LOGOUT = "Manual";
		public static final String USER_AUTO_LOGOUT_TIMEOUT = "Session Timeout";
		public static final String USER_AUTO_LOGOUT_SESSION_INVALIDATED = "Session Invalidated";
	}
	
	public static class MAKER_NOTIF_ACTION {
		public static final String APPROVED = "Approved";
		public static final String REJECTED = "Rejected";
		public static final String CANCELLED = "Cancelled";
	}
	
	public static class UPDATE_JOB{
		public static final String START = "START";
		public static final String DONE = "DONE";
		public static final String ERROR = "ERROR";
	}
	
	public static class MonthlyReportDateRange{
		public static final String ONEWEEK_LESS = "1W<";
		public static final String ONEWEEK_ONEMONTH = "1W-1M<";
		public static final String ONEMONTH_THREEMONTH = "1M-3M<";
		public static final String THREEMONTH_SIXMONTH = "3M-6M<";
		public static final String SIXMONTH_MORE = ">6M";
	}

	public static final String RPT_MARKET_DATA_UPLOAD = "RPT_MKT_DT_UPLOAD";

	public static class MARKET_DATA_REPORT_TYPE {
		public static final String ADHOC = "A";
		public static final String BATCH = "B";
		public static final String MANUAL = "M";
	}
	
	public static class MARKET_DATA_REPORT_GENERATION_STATUS {
		public static final String PENDING = "P";
		public static final String REQUESTING = "R";
		public static final String GENERATING = "G";
		public static final String GENERATED = "GD";
		public static final String COMPLETED = "C";
		public static final String FAILED = "E"; // error
	}
	
	public static class OFF_MARKET_VALIDATION_METHOD {
		public static final String STANDARD_DEVIATION = "SD";
		public static final String BASIS_POINT = "BPS";
		public static final String BOTH = "Both";
	}
	
	public static class SoraTransactionStatus {
		public static final String RESUBMITTED = "Resubmitted";
		public static final String SUBMITTED = "Submitted";
		public static final String HISTORICAL = "Historical";
		public static final String BEFORE_PUBLICATION = "Before Publication";
		public static final String AFTER_PUBLICATION = "After Publication";
	}
	
	public static class SoraStatisticsCalculationMethod {
		public static final String NORMAL = "Normal";
		public static final String CONTINGENCY = "Contingency";
		public static final String REPUBLISH = "(Republished)";
	}
	
	public static class EmailTemplateId {
		public static final String ALL_SUBMITTED = "ALL_SUBMITTED";
		public static final String NOT_ALL_SUBMITTED = "NOT_ALL_SUBMITTED";
		public static final String SORA_ACTIVATED = "SORA_ACTIVATED";
		public static final String RESUBMISSION_BEFORE = "RESUBMISSION_BEFORE";
		public static final String REQUIRED_APPROVAL = "REQUIRED_APPROVAL";
		public static final String NOT_REQUIRED_APPROVAL = "NOT_REQUIRED_APPROVAL";
		public static final String SUCCESSFUL_PUBLISHED = "SUCCESSFUL_PUBLISHED";
		public static final String PD_ON_SUBMISSION = "PD_ON_SUBMISSION";
		public static final String HISTORICAL_SUBMISSION = "HISTORICAL_SUBMISSION";
	}
	
	public static class HousekeepType {
		public static final String DATABASE_RECORD = "DB_RECORD";
		public static final String PHYSICAL_FILE = "PHYSICAL_FILE";
	}
	
	public static class SORA_STATE {
		public static final String PUBLISH = "PUBLISH";
		public static final String REPUBLISH = "REPUBLISH";
	}
	
	public static class SORA_PUBLISH_STATUS {
		public static final String PUBLISHED = "Published";
		public static final String REPUBLISHED = "Republished";
		public static final String NOT_REPUBLISHED = "Not Republished";
	}
	
	public static class DATETIME_FORMAT {
		public static final String yyyyMMdd_w_Dash = "yyyy-MM-dd";
		public static final String yyyyMMdd = "yyyyMMdd";
		public static final String yyyyMMdd_w_Slash = "yyyy/MM/dd";
		
		public static final String ddMMyyyy_w_Slash = "dd/MM/yyyy";
		public static final String ddMMMyyyy_w_Space = "dd MMM yyyy";
		public static final String ddMMyy_w_Dash = "dd-MM-yy";
		public static final String ddMMMyy_w_Dash = "dd-MMM-yy";
		public static final String ddMMyy = "ddMMyy";
		public static final String dMyyyy_w_Slash = "d/M/yyyy";
		
		public static final String HHmm = "HH:mm";
		public static final String hhmma = "hh:mm a";

		public static final String yyyyMMddHHmmss = "yyyyMMddHHmmss";
		public static final String yyyyMMdd_HHmmss = "yyyyMMdd_HHmmss";
		public static final String ddMMMyyyyhhmma_Full = "dd MMM yyyy, hh:mm a";
	}
	
	public static class DELIMITER {
		public static final String COMMA = ",";
		public static final String SEMICOLON = ";";
	}

	public static class SoraErrorMessage {
		public static final String BATCH_ERROR = "Batch job failed. Please contact ITD.";
		public static final String BATCH_NOT_RUN = "Batch job not trigger.";
		public static final String MISSING_SUBMISSION = "Missing submission from counterparty.";
		public static final String CALCULATION_ERROR = "Calculation failed.";
		public static final String PUBLICATION_MISSING_SUBMISSION = "Batch job failed-Not all banks have submitted by publication timing.";
	}

	public static class SoraMonitorTitle {
		public static final String SNAPSHOT = "End of Day Snapshot";
		public static final String LATEST_PUBLICATION = "Current Publication on MAS Website";
		public static final String LATEST_GENERATION = "Latest Computation After Resubmission";
		public static final String LAST_APPROVED = "Last Approved";
	}
	
	public static class MethodCallingFrom {
		public static final String BATCH = "BATCH";
		public static final String ONLINE_WEB = "ONLINE/WEB";
	}

	public static class SFTP_STATUS {
		public static final String SUCCESS = "A";
		public static final String FAILED = "F";
	}
}


