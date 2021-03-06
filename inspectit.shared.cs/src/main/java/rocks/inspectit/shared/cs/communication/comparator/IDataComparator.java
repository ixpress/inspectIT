package rocks.inspectit.shared.cs.communication.comparator;

import rocks.inspectit.shared.all.cmr.service.ICachedDataService;
import rocks.inspectit.shared.all.communication.DefaultData;

/**
 * Interface for all our comparators.
 *
 * @author Ivan Senic
 *
 * @param <T>
 *            For what type comparator made for.
 */
public interface IDataComparator<T extends DefaultData> {

	/**
	 * Compares two {@link DefaultData} elements.
	 *
	 * @param o1
	 *            First object.
	 * @param o2
	 *            Second objects.
	 * @param cachedDataService
	 *            {@link ICachedDataService} for needed relations to other objects.
	 * @return a negative integer, zero, or a positive integer as the first argument is less than,
	 *         equal to, or greater than the second.
	 * @see {@link java.util.Comparator#compare(Object, Object)}
	 */
	int compare(T o1, T o2, ICachedDataService cachedDataService);

}
