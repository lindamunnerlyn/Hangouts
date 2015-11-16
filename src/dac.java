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

public final class dac
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new dad();
    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    dac(String s, String s1, String s2, String s3, boolean flag)
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

    public static dac a(ist ist1)
    {
        return new dac(ist1.a, ist1.e, ist1.c, ist1.d, g.a(ist1.f, false));
    }

    public static dac a(String s)
    {
        return new dac(s, null, null, null, false);
    }

    public static dac a(String s, String s1)
    {
        return new dac(s, s1, null, null, false);
    }

    public static iut[] a(Collection collection)
    {
        iut aiut[];
        Object obj;
        obj = null;
        aiut = obj;
        if (collection == null) goto _L2; else goto _L1
_L1:
        aiut = obj;
        if (collection.isEmpty()) goto _L2; else goto _L3
_L3:
        Iterator iterator;
        iterator = collection.iterator();
        collection = null;
_L5:
        if (iterator.hasNext())
        {
            dac dac1 = (dac)iterator.next();
            if (!TextUtils.isEmpty(dac1.d))
            {
                aiut = new iut();
                aiut.a = new iuw();
                ((iut) (aiut)).a.a = new jtj();
                ((iut) (aiut)).a.a.a = dac1.d;
            } else
            if (!TextUtils.isEmpty(dac1.c))
            {
                aiut = new iut();
                aiut.b = new iuu();
                ((iut) (aiut)).b.a = dac1.c;
            } else
            {
                aiut = null;
            }
            if (aiut != null)
            {
                if (collection == null)
                {
                    collection = new ArrayList();
                }
                collection.add(aiut);
            }
            continue; /* Loop/switch isn't completed */
        }
        aiut = obj;
        if (collection != null)
        {
            aiut = new iut[collection.size()];
            collection.toArray(aiut);
        }
_L2:
        return aiut;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static dac b(String s)
    {
        return new dac(null, null, null, s, false);
    }

    public static dac b(String s, String s1)
    {
        return new dac(null, null, s, s1, false);
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

    public ist d()
    {
        ist ist1 = new ist();
        if (a == null) goto _L2; else goto _L1
_L1:
        ist1.a = a;
_L4:
        if (e)
        {
            ist1.f = Boolean.valueOf(true);
        }
        return ist1;
_L2:
        if (c != null)
        {
            ist1.c = c;
        } else
        if (d != null)
        {
            ist1.d = d;
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
            if (!(obj instanceof dac))
            {
                return false;
            }
            obj = (dac)obj;
            if (!TextUtils.equals(a, ((dac) (obj)).a) || !TextUtils.equals(b, ((dac) (obj)).b) || !TextUtils.equals(c, ((dac) (obj)).c) || !TextUtils.equals(d, ((dac) (obj)).d))
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
