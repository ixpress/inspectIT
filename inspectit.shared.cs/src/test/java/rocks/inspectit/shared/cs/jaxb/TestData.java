package rocks.inspectit.shared.cs.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ivan Senic
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "test-data")
public class TestData extends AbstractSchemaVersionAware {

	@XmlAttribute(name = "value")
	private String value;

	/**
	 * Gets {@link #value}.
	 *
	 * @return {@link #value}
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * Sets {@link #value}.
	 *
	 * @param value
	 *            New value for {@link #value}
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = (prime * result) + ((this.value == null) ? 0 : this.value.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TestData other = (TestData) obj;
		if (this.value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!this.value.equals(other.value)) {
			return false;
		}
		return true;
	}

}
