// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class dbi
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new dbj();
    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    dbi(String s, String s1, String s2, String s3, boolean flag)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = flag;
    }

    private static int a(Object obj)
    {
        if (obj != null)
        {
            return obj.hashCode();
        } else
        {
            return 0;
        }
    }

    public static dbi a(iyy iyy1)
    {
        return new dbi(iyy1.a, iyy1.e, iyy1.c, iyy1.d, g.a(iyy1.f, false));
    }

    public static dbi a(String s)
    {
        return new dbi(s, null, null, null, false);
    }

    public static dbi a(String s, String s1)
    {
        return new dbi(s, s1, null, null, false);
    }

    public static jay[] a(Collection collection)
    {
        jay ajay[];
        Object obj;
        obj = null;
        ajay = obj;
        if (collection == null) goto _L2; else goto _L1
_L1:
        ajay = obj;
        if (collection.isEmpty()) goto _L2; else goto _L3
_L3:
        Iterator iterator;
        iterator = collection.iterator();
        collection = null;
_L5:
        if (iterator.hasNext())
        {
            dbi dbi1 = (dbi)iterator.next();
            if (!TextUtils.isEmpty(dbi1.d))
            {
                ajay = new jay();
                ajay.a = new jbb();
                ((jay) (ajay)).a.a = new kbm();
                ((jay) (ajay)).a.a.a = dbi1.d;
            } else
            if (!TextUtils.isEmpty(dbi1.c))
            {
                ajay = new jay();
                ajay.b = new jaz();
                ((jay) (ajay)).b.a = dbi1.c;
            } else
            {
                ajay = null;
            }
            if (ajay != null)
            {
                if (collection == null)
                {
                    collection = new ArrayList();
                }
                collection.add(ajay);
            }
            continue; /* Loop/switch isn't completed */
        }
        ajay = obj;
        if (collection != null)
        {
            ajay = new jay[collection.size()];
            collection.toArray(ajay);
        }
_L2:
        return ajay;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static dbi b(String s)
    {
        return new dbi(null, null, null, s, false);
    }

    public static dbi b(String s, String s1)
    {
        return new dbi(null, null, s, s1, false);
    }

    public boolean a()
    {
        return a != null || c != null || d != null;
    }

    public boolean b()
    {
        return a != null || b != null || d != null;
    }

    public String c()
    {
        String s = a;
        String s1 = b;
        String s2 = c;
        String s3 = d;
        return (new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append("|").append(s1).append("|").append(s2).append("|").append(s3).toString();
    }

    public iyy d()
    {
        iyy iyy1 = new iyy();
        if (a == null) goto _L2; else goto _L1
_L1:
        iyy1.a = a;
_L4:
        if (e)
        {
            iyy1.f = Boolean.valueOf(true);
        }
        return iyy1;
_L2:
        if (c != null)
        {
            iyy1.c = c;
        } else
        if (d != null)
        {
            iyy1.d = d;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof dbi))
            {
                return false;
            }
            obj = (dbi)obj;
            if (!TextUtils.equals(a, ((dbi) (obj)).a) || !TextUtils.equals(b, ((dbi) (obj)).b) || !TextUtils.equals(c, ((dbi) (obj)).c) || !TextUtils.equals(d, ((dbi) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (((a(a) + 527) * 31 + a(b)) * 31 + a(c)) * 31 + a(d);
    }

    public String toString()
    {
        String s = c;
        String s1 = d;
        String s2 = a;
        String s3 = b;
        boolean flag = e;
        return (new StringBuilder(String.valueOf(s).length() + 86 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("EntityLookupSpec { email: ").append(s).append("  phoneNumber: ").append(s1).append("  gaiaId: ").append(s2).append("  chatId: ").append(s3).append(" createOffNetwork:").append(flag).append(" }").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
