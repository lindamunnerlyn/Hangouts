// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class gtx
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gty();
    private final Class a;
    private final Map b;

    public gtx(Parcel parcel)
    {
        b = new HashMap();
        a = a(parcel.readString());
        ClassLoader classloader = a.getClassLoader();
        int k = parcel.readInt();
        for (int i = 0; i < k; i++)
        {
            int l = parcel.readInt();
            int i1 = parcel.readInt();
            ArrayList arraylist = new ArrayList(i1);
            for (int j = 0; j < i1; j++)
            {
                arraylist.add(parcel.readParcelable(classloader));
            }

            b.put(Integer.valueOf(l), arraylist);
        }

    }

    public gtx(Class class1)
    {
        b = new HashMap();
        a = class1;
    }

    private static Class a(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public List a(Integer integer)
    {
        return (List)b.remove(integer);
    }

    public void a(Integer integer, Parcelable parcelable)
    {
        List list = (List)b.get(integer);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            b.put(integer, obj);
        }
        ((List) (obj)).add(parcelable);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.getName());
        parcel.writeInt(b.size());
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (Integer)iterator.next();
            parcel.writeInt(((Integer) (obj)).intValue());
            obj = (List)b.get(obj);
            parcel.writeInt(((List) (obj)).size());
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                parcel.writeParcelable((Parcelable)((Iterator) (obj)).next(), i);
            }
        }

    }

}
