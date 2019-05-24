package is.yyx.exception;

import is.yyx.enums.RestStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Iterator;

public class RestAssert {

    public static void test(boolean expression, RestStatus restStatus) {
        if (!expression) {
            throw new RestException(restStatus);
        }
    }

    public static void test(boolean expression, RestStatus restStatus, Object detail) {
        if (!expression) {
            throw new RestException(restStatus, detail);
        }
    }

    public static void isNull(Object object, RestStatus restStatus) {
        if (object != null) {
            throw new RestException(restStatus);
        }
    }

    public static void isNull(Object object, RestStatus restStatus, Object detail) {
        if (object != null) {
            throw new RestException(restStatus, detail);
        }
    }

    public static void notNull(Object object, RestStatus restStatus) {
        if (object == null) {
            throw new RestException(restStatus);
        }
    }

    public static void notNull(Object object, RestStatus restStatus, Object detail) {
        if (object == null) {
            throw new RestException(restStatus, detail);
        }
    }

    public static void hasLength(String text, RestStatus restStatus) {
        if (!StringUtils.hasLength(text)) {
            throw new RestException(restStatus);
        }
    }

    public static void hasLength(String text, RestStatus restStatus, Object detail) {
        if (!StringUtils.hasLength(text)) {
            throw new RestException(restStatus, detail);
        }
    }

    public static void hasText(String text, RestStatus restStatus) {
        if (!StringUtils.hasText(text)) {
            throw new RestException(restStatus);
        }
    }

    public static void hasText(String text, RestStatus restStatus, Object detail) {
        if (!StringUtils.hasText(text)) {
            throw new RestException(restStatus, detail);
        }
    }

    public static void doesNotContain(String textToSearch, String substring, RestStatus restStatus) {
        if (StringUtils.hasLength(textToSearch) && StringUtils.hasLength(substring) &&
                textToSearch.contains(substring)) {
            throw new RestException(restStatus);
        }
    }

    public static void doesNotContain(String textToSearch, String substring, RestStatus restStatus, Object detail) {
        if (StringUtils.hasLength(textToSearch) && StringUtils.hasLength(substring) &&
                textToSearch.contains(substring)) {
            throw new RestException(restStatus, detail);
        }
    }

    public static void notEmpty(Object[] array, RestStatus restStatus) {
        if (ObjectUtils.isEmpty(array)) {
            throw new RestException(restStatus);
        }
    }

    public static void notEmpty(Object[] array, RestStatus restStatus, Object detail) {
        if (ObjectUtils.isEmpty(array)) {
            throw new RestException(restStatus, detail);
        }
    }

    public static void noNullElements(Object[] array, RestStatus restStatus) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    throw new RestException(restStatus, "index=" + i);
                }
            }
        }
    }

    public static void noNullElements(Object[] array, RestStatus restStatus, Object detail) {
        if (array != null) {
            for (Object element : array) {
                if (element == null) {
                    throw new RestException(restStatus, detail);
                }
            }
        }
    }

    public static void noEmptyElements(String[] array, RestStatus restStatus) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (StringUtils.isEmpty(array[i])) {
                    throw new RestException(restStatus, "index=" + i);
                }
            }
        }
    }

    public static void noEmptyElements(String[] array, RestStatus restStatus, Object detail) {
        if (array != null) {
            for (String element : array) {
                if (StringUtils.isEmpty(element)) {
                    throw new RestException(restStatus, detail);
                }
            }
        }
    }

    public static void notEmpty(Collection<?> collection, RestStatus restStatus) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new RestException(restStatus);
        }
    }

    public static void notEmpty(Collection<?> collection, RestStatus restStatus, Object detail) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new RestException(restStatus, detail);
        }
    }

    public static void noNullElements(Collection<?> collection, RestStatus restStatus) {
        if (!CollectionUtils.isEmpty(collection)) {
            Iterator iterator = collection.iterator();
            int i = 0;
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    throw new RestException(restStatus, "index=" + i);
                }
                i++;
            }
        }
    }

    public static void noNullElements(Collection<?> collection, RestStatus restStatus, Object detail) {
        if (!CollectionUtils.isEmpty(collection)) {
            for (Object element : collection) {
                if (element == null) {
                    throw new RestException(restStatus, detail);
                }
            }
        }
    }

    public static void noEmptyElements(Collection<String> collection, RestStatus restStatus) {
        if (!CollectionUtils.isEmpty(collection)) {
            Iterator iterator = collection.iterator();
            int i = 0;
            while (iterator.hasNext()) {
                if (StringUtils.isEmpty(iterator.next())) {
                    throw new RestException(restStatus, "index=" + i);
                }
                i++;
            }
        }
    }

    public static void noEmptyElements(Collection<String> collection, RestStatus restStatus, Object detail) {
        if (!CollectionUtils.isEmpty(collection)) {
            for (String element : collection) {
                if (StringUtils.isEmpty(element)) {
                    throw new RestException(restStatus, detail);
                }
            }
        }
    }
}
