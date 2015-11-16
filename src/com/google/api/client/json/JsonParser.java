// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import com.google.api.client.util.GenericData;
import g;
import hnc;
import hng;
import hno;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import l;

// Referenced classes of package com.google.api.client.json:
//            JsonPolymorphicTypeMap, GenericJson, JsonToken, CustomizeJsonParser, 
//            JsonFactory, JsonString

public abstract class JsonParser
{

    private static WeakHashMap cachedTypemapFields = new WeakHashMap();
    private static final Lock lock = new ReentrantLock();

    public JsonParser()
    {
    }

    private static Field getCachedTypemapFieldFor(Class class1)
    {
        if (class1 == null)
        {
            return null;
        }
        lock.lock();
        if (!cachedTypemapFields.containsKey(class1))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        class1 = (Field)cachedTypemapFields.get(class1);
        lock.unlock();
        return class1;
        Iterator iterator = hnc.a(class1).b().iterator();
        Field field = null;
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Field field1;
        Object obj;
        field1 = ((hno)iterator.next()).a();
        obj = (JsonPolymorphicTypeMap)field1.getAnnotation(com/google/api/client/json/JsonPolymorphicTypeMap);
        boolean flag;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        JsonPolymorphicTypeMap.TypeDef typedef;
        int i;
        int j;
        if (field == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", new Object[] {
            class1
        });
        l.a(hng.a(field1.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", new Object[] {
            class1, field1.getType()
        });
        field = ((JsonPolymorphicTypeMap) (obj)).typeDefinitions();
        obj = new HashSet();
        if (field.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
        j = field.length;
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        typedef = field[i];
        l.a(((HashSet) (obj)).add(typedef.key()), "Class contains two @TypeDef annotations with identical key: %s", new Object[] {
            typedef.key()
        });
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        cachedTypemapFields.put(class1, field);
        lock.unlock();
        return field;
        class1;
        lock.unlock();
        throw class1;
_L3:
        field = field1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void parse(ArrayList arraylist, Object obj, CustomizeJsonParser customizejsonparser)
    {
        Object obj1;
        Object obj2;
        hnc hnc1;
        Class class1;
        boolean flag;
        if (obj instanceof GenericJson)
        {
            ((GenericJson)obj).setFactory(getFactory());
        }
        obj2 = startParsingObjectOrArray();
        class1 = obj.getClass();
        hnc1 = hnc.a(class1);
        flag = com/google/api/client/util/GenericData.isAssignableFrom(class1);
        obj1 = obj2;
        if (flag) goto _L2; else goto _L1
_L1:
        obj1 = obj2;
        if (!java/util/Map.isAssignableFrom(class1)) goto _L2; else goto _L3
_L3:
        parseMap(null, (Map)obj, g.d(class1), arraylist, customizejsonparser);
_L5:
        return;
_L6:
label0:
        {
            obj1 = hnc1.a(((String) (obj2)));
            if (obj1 == null)
            {
                break label0;
            }
            if (((hno) (obj1)).d() && !((hno) (obj1)).e())
            {
                throw new IllegalArgumentException("final array/object fields are not supported");
            }
        }
        obj2 = ((hno) (obj1)).a();
        i = arraylist.size();
        arraylist.add(((Field) (obj2)).getGenericType());
        obj2 = parseValue(((Field) (obj2)), ((hno) (obj1)).c(), arraylist, obj, customizejsonparser, true);
        arraylist.remove(i);
        ((hno) (obj1)).a(obj, obj2);
_L7:
        obj1 = nextToken();
_L2:
        if (obj1 != JsonToken.FIELD_NAME) goto _L5; else goto _L4
_L4:
        obj2 = getText();
        nextToken();
        if (customizejsonparser != null && customizejsonparser.stopAt(obj, ((String) (obj2)))) goto _L5; else goto _L6
        if (flag)
        {
            ((GenericData)obj).set(((String) (obj2)), parseValue(null, null, arraylist, obj, customizejsonparser, true));
        } else
        {
            if (customizejsonparser != null)
            {
                customizejsonparser.handleUnrecognizedKey(obj, ((String) (obj2)));
            }
            skipChildren();
        }
          goto _L7
    }

    private void parseArray(Field field, Collection collection, Type type, ArrayList arraylist, CustomizeJsonParser customizejsonparser)
    {
        for (JsonToken jsontoken = startParsingObjectOrArray(); jsontoken != JsonToken.END_ARRAY; jsontoken = nextToken())
        {
            collection.add(parseValue(field, type, arraylist, collection, customizejsonparser, true));
        }

    }

    private void parseMap(Field field, Map map, Type type, ArrayList arraylist, CustomizeJsonParser customizejsonparser)
    {
        Object obj = startParsingObjectOrArray();
        do
        {
label0:
            {
                if (obj == JsonToken.FIELD_NAME)
                {
                    obj = getText();
                    nextToken();
                    if (customizejsonparser == null || !customizejsonparser.stopAt(map, ((String) (obj))))
                    {
                        break label0;
                    }
                }
                return;
            }
            map.put(obj, parseValue(field, type, arraylist, map, customizejsonparser, true));
            obj = nextToken();
        } while (true);
    }

    private final Object parseValue(Field field, Type type, ArrayList arraylist, Object obj, CustomizeJsonParser customizejsonparser, boolean flag)
    {
        Object obj3;
        Type type1;
        type1 = hng.a(arraylist, type);
        if (type1 instanceof Class)
        {
            type = (Class)type1;
        } else
        {
            type = null;
        }
        obj3 = type;
        if (type1 instanceof ParameterizedType)
        {
            obj3 = g.a((ParameterizedType)type1);
        }
        if (obj3 != java/lang/Void) goto _L2; else goto _L1
_L1:
        skipChildren();
        obj = null;
_L43:
        return obj;
_L2:
        type = getCurrentToken();
        _cls1..SwitchMap.com.google.api.client.json.JsonToken[getCurrentToken().ordinal()];
        JVM INSTR tableswitch 1 11: default 1373
    //                   1 420
    //                   2 258
    //                   3 258
    //                   4 420
    //                   5 420
    //                   6 833
    //                   7 833
    //                   8 897
    //                   9 897
    //                   10 1144
    //                   11 1271;
           goto _L3 _L4 _L5 _L5 _L4 _L4 _L6 _L6 _L7 _L7 _L8 _L9
_L3:
        type = String.valueOf(type);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(type).length() + 27)).append("unexpected JSON node type: ").append(type).toString());
_L5:
        boolean flag1;
        try
        {
            flag1 = g.a(type1);
        }
        // Misplaced declaration of an exception variable
        catch (Type type)
        {
            arraylist = new StringBuilder();
            obj = getCurrentName();
            if (obj != null)
            {
                arraylist.append("key ").append(((String) (obj)));
            }
            if (field != null)
            {
                if (obj != null)
                {
                    arraylist.append(", ");
                }
                arraylist.append("field ").append(field);
            }
            throw new IllegalArgumentException(arraylist.toString(), type);
        }
        if (type1 == null || flag1) goto _L11; else goto _L10
_L10:
        if (obj3 == null) goto _L13; else goto _L12
_L12:
        if (!g.a(((Class) (obj3)), java/util/Collection)) goto _L13; else goto _L11
_L93:
        l.a(flag, "expected collection or array type but got %s", new Object[] {
            type1
        });
        Object obj1 = null;
        type = obj1;
        if (customizejsonparser == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        type = obj1;
        if (field == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        type = customizejsonparser.newInstanceForArray(obj, field);
        obj = type;
        if (type != null) goto _L15; else goto _L14
_L14:
        obj = hng.b(type1);
_L15:
        if (!flag1) goto _L17; else goto _L16
_L16:
        type = g.b(type1);
_L23:
        type = hng.a(arraylist, type);
        parseArray(field, ((Collection) (obj)), type, arraylist, customizejsonparser);
        if (!flag1) goto _L19; else goto _L18
_L18:
        return g.a(((Collection) (obj)), g.a(arraylist, type));
_L17:
        if (obj3 == null) goto _L21; else goto _L20
_L20:
        if (!java/lang/Iterable.isAssignableFrom(((Class) (obj3)))) goto _L21; else goto _L22
_L22:
        type = g.c(type1);
          goto _L23
_L4:
        Object obj2;
        Field field1;
        int i;
        int j;
        if (!g.a(type1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l.a(flag1, "expected object or map type but got %s", new Object[] {
            type1
        });
        if (!flag) goto _L25; else goto _L24
_L24:
        field1 = getCachedTypemapFieldFor(((Class) (obj3)));
_L94:
        type = null;
        obj2 = type;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        obj2 = type;
        if (customizejsonparser == null)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        obj2 = customizejsonparser.newInstanceForObject(obj, ((Class) (obj3)));
        if (obj3 == null) goto _L27; else goto _L26
_L26:
        if (!g.a(((Class) (obj3)), java/util/Map)) goto _L27; else goto _L28
_L28:
        i = 1;
_L95:
        if (field1 == null) goto _L30; else goto _L29
_L29:
        type = new GenericJson();
_L39:
        j = arraylist.size();
        if (type1 == null) goto _L32; else goto _L31
_L31:
        arraylist.add(type1);
_L32:
        if (i == 0) goto _L34; else goto _L33
_L33:
        if (com/google/api/client/util/GenericData.isAssignableFrom(((Class) (obj3)))) goto _L34; else goto _L35
_L35:
        if (!java/util/Map.isAssignableFrom(((Class) (obj3)))) goto _L37; else goto _L36
_L36:
        obj = g.d(type1);
_L99:
        if (obj == null) goto _L34; else goto _L38
_L38:
        parseMap(field, (Map)type, ((Type) (obj)), arraylist, customizejsonparser);
        return type;
_L97:
        type = hng.b(((Class) (obj3)));
          goto _L39
_L98:
        type = ((Type) (g.a(((Class) (obj3)))));
          goto _L39
_L34:
        parse(arraylist, type, customizejsonparser);
        if (type1 == null) goto _L41; else goto _L40
_L40:
        arraylist.remove(j);
_L41:
        obj = type;
        if (field1 == null) goto _L43; else goto _L42
_L42:
        obj = ((GenericJson)type).get(field1.getName());
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag, "No value specified for @JsonPolymorphicTypeMap field");
        obj2 = obj.toString();
        obj = (JsonPolymorphicTypeMap)field1.getAnnotation(com/google/api/client/json/JsonPolymorphicTypeMap);
        customizejsonparser = null;
        obj3 = ((JsonPolymorphicTypeMap) (obj)).typeDefinitions();
        j = obj3.length;
        i = 0;
_L101:
        obj = customizejsonparser;
        if (i >= j) goto _L45; else goto _L44
_L44:
        obj = obj3[i];
        if (!((JsonPolymorphicTypeMap.TypeDef) (obj)).key().equals(obj2)) goto _L47; else goto _L46
_L46:
        obj = ((JsonPolymorphicTypeMap.TypeDef) (obj)).ref();
          goto _L45
_L100:
        customizejsonparser = String.valueOf(obj2);
        if (customizejsonparser.length() != 0)
        {
            customizejsonparser = "No TypeDef annotation found with key: ".concat(customizejsonparser);
        } else
        {
            customizejsonparser = new String("No TypeDef annotation found with key: ");
        }
        l.a(flag, customizejsonparser);
        customizejsonparser = getFactory();
        type = customizejsonparser.createJsonParser(customizejsonparser.toString(type));
        type.startParsing();
        return type.parseValue(field, ((Type) (obj)), arraylist, null, null, false);
_L6:
        if (type1 == null) goto _L49; else goto _L48
_L48:
        if (obj3 == Boolean.TYPE) goto _L49; else goto _L50
_L50:
        if (obj3 == null) goto _L52; else goto _L51
_L51:
        if (!((Class) (obj3)).isAssignableFrom(java/lang/Boolean)) goto _L52; else goto _L49
_L102:
        l.a(flag, "expected type Boolean or boolean but got %s", new Object[] {
            type1
        });
        if (type == JsonToken.VALUE_TRUE)
        {
            return Boolean.TRUE;
        } else
        {
            return Boolean.FALSE;
        }
_L7:
        if (field == null) goto _L54; else goto _L53
_L53:
        if (field.getAnnotation(com/google/api/client/json/JsonString) != null) goto _L55; else goto _L54
_L103:
        l.a(flag, "number type formatted as a JSON number cannot use @JsonString annotation");
        if (obj3 == null) goto _L57; else goto _L56
_L56:
        if (!((Class) (obj3)).isAssignableFrom(java/math/BigDecimal)) goto _L58; else goto _L57
_L57:
        return getDecimalValue();
_L58:
        if (obj3 != java/math/BigInteger) goto _L60; else goto _L59
_L59:
        return getBigIntegerValue();
_L60:
        if (obj3 == java/lang/Double) goto _L62; else goto _L61
_L61:
        if (obj3 != Double.TYPE) goto _L63; else goto _L62
_L62:
        return Double.valueOf(getDoubleValue());
_L63:
        if (obj3 == java/lang/Long) goto _L65; else goto _L64
_L64:
        if (obj3 != Long.TYPE) goto _L66; else goto _L65
_L65:
        return Long.valueOf(getLongValue());
_L66:
        if (obj3 == java/lang/Float) goto _L68; else goto _L67
_L67:
        if (obj3 != Float.TYPE) goto _L69; else goto _L68
_L68:
        return Float.valueOf(getFloatValue());
_L69:
        if (obj3 == java/lang/Integer) goto _L71; else goto _L70
_L70:
        if (obj3 != Integer.TYPE) goto _L72; else goto _L71
_L71:
        return Integer.valueOf(getIntValue());
_L72:
        if (obj3 == java/lang/Short) goto _L74; else goto _L73
_L73:
        if (obj3 != Short.TYPE) goto _L75; else goto _L74
_L74:
        return Short.valueOf(getShortValue());
_L75:
        if (obj3 == java/lang/Byte) goto _L77; else goto _L76
_L76:
        if (obj3 != Byte.TYPE) goto _L78; else goto _L77
_L77:
        return Byte.valueOf(getByteValue());
_L78:
        type = String.valueOf(type1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(type).length() + 30)).append("expected numeric type but got ").append(type).toString());
_L8:
        type = getText().trim().toLowerCase(Locale.ROOT);
        if (obj3 == Float.TYPE || obj3 == java/lang/Float) goto _L80; else goto _L79
_L79:
        if (obj3 != Double.TYPE && obj3 != java/lang/Double) goto _L81; else goto _L80
_L80:
        if (type.equals("nan") || type.equals("infinity") || type.equals("-infinity")) goto _L82; else goto _L81
_L81:
        if (obj3 == null) goto _L84; else goto _L83
_L83:
        if (!java/lang/Number.isAssignableFrom(((Class) (obj3)))) goto _L84; else goto _L85
_L85:
        if (field == null) goto _L87; else goto _L86
_L86:
        if (field.getAnnotation(com/google/api/client/json/JsonString) == null) goto _L87; else goto _L84
_L104:
        l.a(flag, "number field formatted as a JSON string must use the @JsonString annotation");
_L82:
        return hng.a(type1, getText());
_L9:
        if (obj3 == null) goto _L89; else goto _L88
_L88:
        if (((Class) (obj3)).isPrimitive()) goto _L90; else goto _L89
_L105:
        l.a(flag, "primitive number field but found a JSON null");
        if (obj3 == null) goto _L92; else goto _L91
_L91:
        if ((((Class) (obj3)).getModifiers() & 0x600) != 0)
        {
            if (g.a(((Class) (obj3)), java/util/Collection))
            {
                return hng.a(hng.b(type1).getClass());
            }
            if (g.a(((Class) (obj3)), java/util/Map))
            {
                return hng.a(hng.b(((Class) (obj3))).getClass());
            }
        }
_L92:
        type = ((Type) (hng.a(g.a(arraylist, type1))));
        return type;
_L21:
        type = null;
          goto _L23
_L11:
        flag = true;
          goto _L93
_L13:
        flag = false;
          goto _L93
_L19:
        return obj;
_L25:
        field1 = null;
          goto _L94
_L27:
        i = 0;
          goto _L95
_L30:
        type = ((Type) (obj2));
        if (obj2 != null) goto _L39; else goto _L96
_L96:
        if (i == 0 && obj3 != null) goto _L98; else goto _L97
_L37:
        obj = null;
          goto _L99
_L45:
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L100
_L47:
        i++;
          goto _L101
_L49:
        flag = true;
          goto _L102
_L52:
        flag = false;
          goto _L102
_L54:
        flag = true;
          goto _L103
_L55:
        flag = false;
          goto _L103
_L84:
        flag = true;
          goto _L104
_L87:
        flag = false;
          goto _L104
_L89:
        flag = true;
          goto _L105
_L90:
        flag = false;
          goto _L105
    }

    private JsonToken startParsing()
    {
        JsonToken jsontoken = getCurrentToken();
        if (jsontoken == null)
        {
            jsontoken = nextToken();
        }
        boolean flag;
        if (jsontoken != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag, "no JSON input found");
        return jsontoken;
    }

    private JsonToken startParsingObjectOrArray()
    {
        JsonToken jsontoken = startParsing();
        switch (_cls1..SwitchMap.com.google.api.client.json.JsonToken[jsontoken.ordinal()])
        {
        default:
            return jsontoken;

        case 1: // '\001'
            JsonToken jsontoken1 = nextToken();
            boolean flag;
            if (jsontoken1 == JsonToken.FIELD_NAME || jsontoken1 == JsonToken.END_OBJECT)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l.a(flag, jsontoken1);
            return jsontoken1;

        case 2: // '\002'
            return nextToken();
        }
    }

    public abstract void close();

    public abstract BigInteger getBigIntegerValue();

    public abstract byte getByteValue();

    public abstract String getCurrentName();

    public abstract JsonToken getCurrentToken();

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public abstract JsonFactory getFactory();

    public abstract float getFloatValue();

    public abstract int getIntValue();

    public abstract long getLongValue();

    public abstract short getShortValue();

    public abstract String getText();

    public abstract JsonToken nextToken();

    public final Object parse(Class class1)
    {
        return parse(class1, ((CustomizeJsonParser) (null)));
    }

    public final Object parse(Class class1, CustomizeJsonParser customizejsonparser)
    {
        return parse(((Type) (class1)), false, customizejsonparser);
    }

    public Object parse(Type type, boolean flag)
    {
        return parse(type, flag, null);
    }

    public Object parse(Type type, boolean flag, CustomizeJsonParser customizejsonparser)
    {
        if (!java/lang/Void.equals(type))
        {
            startParsing();
        }
        type = ((Type) (parseValue(null, type, new ArrayList(), null, customizejsonparser, true)));
        if (flag)
        {
            close();
        }
        return type;
        type;
        if (flag)
        {
            close();
        }
        throw type;
    }

    public final void parse(Object obj)
    {
        parse(obj, ((CustomizeJsonParser) (null)));
    }

    public final void parse(Object obj, CustomizeJsonParser customizejsonparser)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(obj.getClass());
        parse(arraylist, obj, customizejsonparser);
    }

    public final Object parseAndClose(Class class1)
    {
        return parseAndClose(class1, null);
    }

    public final Object parseAndClose(Class class1, CustomizeJsonParser customizejsonparser)
    {
        class1 = ((Class) (parse(class1, customizejsonparser)));
        close();
        return class1;
        class1;
        close();
        throw class1;
    }

    public final void parseAndClose(Object obj)
    {
        parseAndClose(obj, null);
    }

    public final void parseAndClose(Object obj, CustomizeJsonParser customizejsonparser)
    {
        parse(obj, customizejsonparser);
        close();
        return;
        obj;
        close();
        throw obj;
    }

    public final Collection parseArray(Class class1, Class class2)
    {
        return parseArray(class1, class2, null);
    }

    public final Collection parseArray(Class class1, Class class2, CustomizeJsonParser customizejsonparser)
    {
        class1 = hng.b(class1);
        parseArray(((Collection) (class1)), class2, customizejsonparser);
        return class1;
    }

    public final void parseArray(Collection collection, Class class1)
    {
        parseArray(collection, class1, null);
    }

    public final void parseArray(Collection collection, Class class1, CustomizeJsonParser customizejsonparser)
    {
        parseArray(null, collection, ((Type) (class1)), new ArrayList(), customizejsonparser);
    }

    public final Collection parseArrayAndClose(Class class1, Class class2)
    {
        return parseArrayAndClose(class1, class2, null);
    }

    public final Collection parseArrayAndClose(Class class1, Class class2, CustomizeJsonParser customizejsonparser)
    {
        class1 = parseArray(class1, class2, customizejsonparser);
        close();
        return class1;
        class1;
        close();
        throw class1;
    }

    public final void parseArrayAndClose(Collection collection, Class class1)
    {
        parseArrayAndClose(collection, class1, null);
    }

    public final void parseArrayAndClose(Collection collection, Class class1, CustomizeJsonParser customizejsonparser)
    {
        parseArray(collection, class1, customizejsonparser);
        close();
        return;
        collection;
        close();
        throw collection;
    }

    public abstract JsonParser skipChildren();

    public final String skipToKey(Set set)
    {
        for (Object obj = startParsingObjectOrArray(); obj == JsonToken.FIELD_NAME; obj = nextToken())
        {
            obj = getText();
            nextToken();
            if (set.contains(obj))
            {
                return ((String) (obj));
            }
            skipChildren();
        }

        return null;
    }

    public final void skipToKey(String s)
    {
        skipToKey(Collections.singleton(s));
    }


    private class _cls1
    {

        static final int $SwitchMap$com$google$api$client$json$JsonToken[];

        static 
        {
            $SwitchMap$com$google$api$client$json$JsonToken = new int[JsonToken.values().length];
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.START_ARRAY.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.END_ARRAY.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.END_OBJECT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
