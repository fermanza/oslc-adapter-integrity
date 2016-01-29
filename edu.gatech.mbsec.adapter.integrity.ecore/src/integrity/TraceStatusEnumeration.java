/**
 */
package integrity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trace Status Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see integrity.IntegrityPackage#getTraceStatusEnumeration()
 * @model
 * @generated
 */
public enum TraceStatusEnumeration implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Downstream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNSTREAM_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNSTREAM(1, "Downstream", "Downstream"),

	/**
	 * The '<em><b>Downstream Related</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNSTREAM_RELATED_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNSTREAM_RELATED(2, "DownstreamRelated", "DownstreamRelated"),

	/**
	 * The '<em><b>Downstream Suspect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNSTREAM_SUSPECT_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNSTREAM_SUSPECT(3, "DownstreamSuspect", "DownstreamSuspect"),

	/**
	 * The '<em><b>Downstream Suspect Related</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNSTREAM_SUSPECT_RELATED_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNSTREAM_SUSPECT_RELATED(4, "DownstreamSuspectRelated", "DownstreamSuspectRelated"),

	/**
	 * The '<em><b>Upstream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM(5, "upstream", "upstream"),

	/**
	 * The '<em><b>Upstream Downstream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_DOWNSTREAM_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_DOWNSTREAM(6, "UpstreamDownstream", "UpstreamDownstream"),

	/**
	 * The '<em><b>Upstream Downstream Related</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_DOWNSTREAM_RELATED_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_DOWNSTREAM_RELATED(7, "UpstreamDownstreamRelated", "UpstreamDownstreamRelated"),

	/**
	 * The '<em><b>Upstream Downstream Suspect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_DOWNSTREAM_SUSPECT_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_DOWNSTREAM_SUSPECT(8, "UpstreamDownstreamSuspect", "UpstreamDownstreamSuspect"),

	/**
	 * The '<em><b>Upstream Downstream Suspect Related</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_DOWNSTREAM_SUSPECT_RELATED_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_DOWNSTREAM_SUSPECT_RELATED(9, "UpstreamDownstreamSuspectRelated", "UpstreamDownstreamSuspectRelated"),

	/**
	 * The '<em><b>Upstream Related</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_RELATED_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_RELATED(10, "UpstreamRelated", "UpstreamRelated"),

	/**
	 * The '<em><b>Upstream Suspect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_SUSPECT(11, "UpstreamSuspect", "UpstreamSuspect"),

	/**
	 * The '<em><b>Upstream Suspect Downstream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_DOWNSTREAM_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_SUSPECT_DOWNSTREAM(12, "UpstreamSuspectDownstream", "UpstreamSuspectDownstream"),

	/**
	 * The '<em><b>Upstream Suspect Downstream Related</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_DOWNSTREAM_RELATED_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_SUSPECT_DOWNSTREAM_RELATED(13, "UpstreamSuspectDownstreamRelated", "UpstreamSuspectDownstreamRelated"),

	/**
	 * The '<em><b>Upstream Suspect Downstream Suspect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT(14, "UpstreamSuspectDownstreamSuspect", "UpstreamSuspectDownstreamSuspect"),

	/**
	 * The '<em><b>Upstream Suspect Downstream Suspect Related</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_RELATED_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_RELATED(15, "UpstreamSuspectDownstreamSuspectRelated", "UpstreamSuspectDownstreamSuspectRelated"),

	/**
	 * The '<em><b>Upstream Suspect Related</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_RELATED_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM_SUSPECT_RELATED(16, "UpstreamSuspectRelated", "UpstreamSuspectRelated");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Downstream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Downstream</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWNSTREAM
	 * @model name="Downstream"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNSTREAM_VALUE = 1;

	/**
	 * The '<em><b>Downstream Related</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Downstream Related</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWNSTREAM_RELATED
	 * @model name="DownstreamRelated"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNSTREAM_RELATED_VALUE = 2;

	/**
	 * The '<em><b>Downstream Suspect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Downstream Suspect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWNSTREAM_SUSPECT
	 * @model name="DownstreamSuspect"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNSTREAM_SUSPECT_VALUE = 3;

	/**
	 * The '<em><b>Downstream Suspect Related</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Downstream Suspect Related</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWNSTREAM_SUSPECT_RELATED
	 * @model name="DownstreamSuspectRelated"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNSTREAM_SUSPECT_RELATED_VALUE = 4;

	/**
	 * The '<em><b>Upstream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM
	 * @model name="upstream"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_VALUE = 5;

	/**
	 * The '<em><b>Upstream Downstream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Downstream</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_DOWNSTREAM
	 * @model name="UpstreamDownstream"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_DOWNSTREAM_VALUE = 6;

	/**
	 * The '<em><b>Upstream Downstream Related</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Downstream Related</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_DOWNSTREAM_RELATED
	 * @model name="UpstreamDownstreamRelated"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_DOWNSTREAM_RELATED_VALUE = 7;

	/**
	 * The '<em><b>Upstream Downstream Suspect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Downstream Suspect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_DOWNSTREAM_SUSPECT
	 * @model name="UpstreamDownstreamSuspect"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_DOWNSTREAM_SUSPECT_VALUE = 8;

	/**
	 * The '<em><b>Upstream Downstream Suspect Related</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Downstream Suspect Related</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_DOWNSTREAM_SUSPECT_RELATED
	 * @model name="UpstreamDownstreamSuspectRelated"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_DOWNSTREAM_SUSPECT_RELATED_VALUE = 9;

	/**
	 * The '<em><b>Upstream Related</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Related</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_RELATED
	 * @model name="UpstreamRelated"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_RELATED_VALUE = 10;

	/**
	 * The '<em><b>Upstream Suspect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Suspect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT
	 * @model name="UpstreamSuspect"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_SUSPECT_VALUE = 11;

	/**
	 * The '<em><b>Upstream Suspect Downstream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Suspect Downstream</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_DOWNSTREAM
	 * @model name="UpstreamSuspectDownstream"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_SUSPECT_DOWNSTREAM_VALUE = 12;

	/**
	 * The '<em><b>Upstream Suspect Downstream Related</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Suspect Downstream Related</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_DOWNSTREAM_RELATED
	 * @model name="UpstreamSuspectDownstreamRelated"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_SUSPECT_DOWNSTREAM_RELATED_VALUE = 13;

	/**
	 * The '<em><b>Upstream Suspect Downstream Suspect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Suspect Downstream Suspect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT
	 * @model name="UpstreamSuspectDownstreamSuspect"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_VALUE = 14;

	/**
	 * The '<em><b>Upstream Suspect Downstream Suspect Related</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Suspect Downstream Suspect Related</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_RELATED
	 * @model name="UpstreamSuspectDownstreamSuspectRelated"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_RELATED_VALUE = 15;

	/**
	 * The '<em><b>Upstream Suspect Related</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upstream Suspect Related</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_SUSPECT_RELATED
	 * @model name="UpstreamSuspectRelated"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_SUSPECT_RELATED_VALUE = 16;

	/**
	 * An array of all the '<em><b>Trace Status Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TraceStatusEnumeration[] VALUES_ARRAY =
		new TraceStatusEnumeration[] {
			NONE,
			DOWNSTREAM,
			DOWNSTREAM_RELATED,
			DOWNSTREAM_SUSPECT,
			DOWNSTREAM_SUSPECT_RELATED,
			UPSTREAM,
			UPSTREAM_DOWNSTREAM,
			UPSTREAM_DOWNSTREAM_RELATED,
			UPSTREAM_DOWNSTREAM_SUSPECT,
			UPSTREAM_DOWNSTREAM_SUSPECT_RELATED,
			UPSTREAM_RELATED,
			UPSTREAM_SUSPECT,
			UPSTREAM_SUSPECT_DOWNSTREAM,
			UPSTREAM_SUSPECT_DOWNSTREAM_RELATED,
			UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT,
			UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_RELATED,
			UPSTREAM_SUSPECT_RELATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Trace Status Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TraceStatusEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trace Status Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceStatusEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TraceStatusEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trace Status Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceStatusEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TraceStatusEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trace Status Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceStatusEnumeration get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case DOWNSTREAM_VALUE: return DOWNSTREAM;
			case DOWNSTREAM_RELATED_VALUE: return DOWNSTREAM_RELATED;
			case DOWNSTREAM_SUSPECT_VALUE: return DOWNSTREAM_SUSPECT;
			case DOWNSTREAM_SUSPECT_RELATED_VALUE: return DOWNSTREAM_SUSPECT_RELATED;
			case UPSTREAM_VALUE: return UPSTREAM;
			case UPSTREAM_DOWNSTREAM_VALUE: return UPSTREAM_DOWNSTREAM;
			case UPSTREAM_DOWNSTREAM_RELATED_VALUE: return UPSTREAM_DOWNSTREAM_RELATED;
			case UPSTREAM_DOWNSTREAM_SUSPECT_VALUE: return UPSTREAM_DOWNSTREAM_SUSPECT;
			case UPSTREAM_DOWNSTREAM_SUSPECT_RELATED_VALUE: return UPSTREAM_DOWNSTREAM_SUSPECT_RELATED;
			case UPSTREAM_RELATED_VALUE: return UPSTREAM_RELATED;
			case UPSTREAM_SUSPECT_VALUE: return UPSTREAM_SUSPECT;
			case UPSTREAM_SUSPECT_DOWNSTREAM_VALUE: return UPSTREAM_SUSPECT_DOWNSTREAM;
			case UPSTREAM_SUSPECT_DOWNSTREAM_RELATED_VALUE: return UPSTREAM_SUSPECT_DOWNSTREAM_RELATED;
			case UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_VALUE: return UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT;
			case UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_RELATED_VALUE: return UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_RELATED;
			case UPSTREAM_SUSPECT_RELATED_VALUE: return UPSTREAM_SUSPECT_RELATED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TraceStatusEnumeration(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TraceStatusEnumeration
