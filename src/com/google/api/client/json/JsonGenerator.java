// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import com.google.api.client.util.GenericData;
import g;
import hnc;
import hng;
import hnl;
import hno;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l;

// Referenced classes of package com.google.api.client.json:
//            JsonString, JsonFactory

public abstract class JsonGenerator
{

    public JsonGenerator()
    {
    }

    private void serialize(boolean flag, Object obj)
    {
        boolean flag2 = true;
        if (obj == null)
        {
            return;
        }
        Object obj1 = obj.getClass();
        if (hng.a(obj))
        {
            writeNull();
            return;
        }
        if (obj instanceof String)
        {
            writeString((String)obj);
            return;
        }
        if (obj instanceof Number)
        {
            if (flag)
            {
                writeString(obj.toString());
                return;
            }
            if (obj instanceof BigDecimal)
            {
                writeNumber((BigDecimal)obj);
                return;
            }
            if (obj instanceof BigInteger)
            {
                writeNumber((BigInteger)obj);
                return;
            }
            if (obj instanceof Long)
            {
                writeNumber(((Long)obj).longValue());
                return;
            }
            if (obj instanceof Float)
            {
                float f = ((Number)obj).floatValue();
                if (!Float.isInfinite(f) && !Float.isNaN(f))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                l.a(flag);
                writeNumber(f);
                return;
            }
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte))
            {
                writeNumber(((Number)obj).intValue());
                return;
            }
            double d = ((Number)obj).doubleValue();
            if (!Double.isInfinite(d) && !Double.isNaN(d))
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            l.a(flag);
            writeNumber(d);
            return;
        }
        if (obj instanceof Boolean)
        {
            writeBoolean(((Boolean)obj).booleanValue());
            return;
        }
        if (obj instanceof hnl)
        {
            writeString(((hnl)obj).a());
            return;
        }
        if ((obj instanceof Iterable) || ((Class) (obj1)).isArray())
        {
            writeStartArray();
            for (obj = g.e(obj).iterator(); ((Iterator) (obj)).hasNext(); serialize(flag, ((Iterator) (obj)).next())) { }
            writeEndArray();
            return;
        }
        if (((Class) (obj1)).isEnum())
        {
            obj = hno.a((Enum)obj).b();
            if (obj == null)
            {
                writeNull();
                return;
            } else
            {
                writeString(((String) (obj)));
                return;
            }
        }
        writeStartObject();
        boolean flag1;
        if ((obj instanceof Map) && !(obj instanceof GenericData))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            obj1 = null;
        } else
        {
            obj1 = hnc.a(((Class) (obj1)));
        }
        obj = hng.b(obj).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj3 = (java.util.Map.Entry)((Iterator) (obj)).next();
            Object obj2 = ((java.util.Map.Entry) (obj3)).getValue();
            if (obj2 != null)
            {
                obj3 = (String)((java.util.Map.Entry) (obj3)).getKey();
                boolean flag3;
                if (flag1)
                {
                    flag3 = flag;
                } else
                {
                    Field field = ((hnc) (obj1)).b(((String) (obj3)));
                    if (field != null && field.getAnnotation(com/google/api/client/json/JsonString) != null)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                }
                writeFieldName(((String) (obj3)));
                serialize(flag3, obj2);
            }
        } while (true);
        writeEndObject();
    }

    public abstract void close();

    public void enablePrettyPrint()
    {
    }

    public abstract void flush();

    public abstract JsonFactory getFactory();

    public final void serialize(Object obj)
    {
        serialize(false, obj);
    }

    public abstract void writeBoolean(boolean flag);

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public abstract void writeFieldName(String s);

    public abstract void writeNull();

    public abstract void writeNumber(double d);

    public abstract void writeNumber(float f);

    public abstract void writeNumber(int i);

    public abstract void writeNumber(long l1);

    public abstract void writeNumber(String s);

    public abstract void writeNumber(BigDecimal bigdecimal);

    public abstract void writeNumber(BigInteger biginteger);

    public abstract void writeStartArray();

    public abstract void writeStartObject();

    public abstract void writeString(String s);
}
