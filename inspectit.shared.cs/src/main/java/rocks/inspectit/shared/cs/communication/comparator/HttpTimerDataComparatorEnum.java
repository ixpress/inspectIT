package rocks.inspectit.shared.cs.communication.comparator;

import java.util.Comparator;

import rocks.inspectit.shared.all.cmr.service.ICachedDataService;
import rocks.inspectit.shared.all.communication.data.HttpTimerData;
import rocks.inspectit.shared.all.util.ObjectUtils;

/**
 * Comparators for {@link HttpTimerData}.
 *
 * @author Ivan Senic
 *
 */
public enum HttpTimerDataComparatorEnum implements IDataComparator<HttpTimerData>, Comparator<HttpTimerData> {

	/**
	 * Sort by URI.
	 */
	URI,

	/**
	 * Sort by request method.
	 */
	HTTP_METHOD,

	/**
	 * Sort by inspectit tag value (if available).
	 */
	TAG_VALUE;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compare(HttpTimerData o1, HttpTimerData o2, ICachedDataService cachedDataService) {
		return compare(o1, o2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compare(HttpTimerData o1, HttpTimerData o2) {
		switch (this) {
		case URI:
			return ObjectUtils.compare(o1.getHttpInfo().getUri(), o2.getHttpInfo().getUri());
		case HTTP_METHOD:
			return ObjectUtils.compare(o1.getHttpInfo().getRequestMethod(), o2.getHttpInfo().getRequestMethod());
		case TAG_VALUE:
			return ObjectUtils.compare(o1.getHttpInfo().getInspectItTaggingHeaderValue(), o2.getHttpInfo().getInspectItTaggingHeaderValue());
		default:
			return 0;
		}
	}

}
