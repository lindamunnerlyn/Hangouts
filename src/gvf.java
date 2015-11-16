// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class gvf
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gvg();
    private static final String a[] = new String[0];
    private int b;
    private Map c;

    gvf(Parcel parcel)
    {
        b = parcel.readInt();
        int j = parcel.readInt();
        c = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            String s = parcel.readString();
            int k = parcel.readInt();
            c.put(s, Integer.valueOf(k));
        }

    }

    public gvf(gvq gvq1)
    {
        b = gvq1.a();
        c = new HashMap();
    }

    int a()
    {
        return b;
    }

    int a(String s)
    {
        return g.a((Integer)c.get(s), 0);
    }

    void a(guy guy1)
    {
        String s = guy1.h();
        guy1 = (Integer)c.get(s);
        if (guy1 == null)
        {
            guy1 = Integer.valueOf(1);
        } else
        {
            guy1 = Integer.valueOf(guy1.intValue() + 1);
        }
        c.put(s, guy1);
    }

    void b(String s)
    {
        Integer integer;
label0:
        {
            integer = (Integer)c.get(s);
            if (integer != null)
            {
                if (integer.intValue() != 1)
                {
                    break label0;
                }
                c.remove(s);
            }
            return;
        }
        c.put(s, Integer.valueOf(integer.intValue() - 1));
    }

    String[] b()
    {
        if (c.isEmpty())
        {
            return a;
        } else
        {
            String as[] = new String[c.size()];
            return (String[])c.keySet().toArray(as);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(b);
        parcel.writeInt(c.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); parcel.writeInt(((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            parcel.writeString((String)entry.getKey());
        }

    }

}
