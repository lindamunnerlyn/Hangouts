// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eoj;
import g;
import java.util.Arrays;

public final class AudienceMember
    implements SafeParcelable
{

    public static final eoj CREATOR = new eoj();
    private final int a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Bundle h;

    public AudienceMember(int i, int j, int k, String s, String s1, String s2, String s3, 
            Bundle bundle)
    {
        a = i;
        b = j;
        c = k;
        d = s;
        e = s1;
        f = s2;
        g = s3;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        h = bundle;
    }

    private AudienceMember(int i, int j, String s, String s1, String s2, String s3)
    {
        this(1, i, j, s, s1, s2, null, null);
    }

    public static AudienceMember a(String s)
    {
        return new AudienceMember(2, 0, null, s, null, null);
    }

    public static AudienceMember a(String s, String s1)
    {
        return new AudienceMember(1, -1, s, null, s1, null);
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof AudienceMember)
        {
            if (a == ((AudienceMember) (obj = (AudienceMember)obj)).a && b == ((AudienceMember) (obj)).b && c == ((AudienceMember) (obj)).c && g.a(d, ((AudienceMember) (obj)).d) && g.a(e, ((AudienceMember) (obj)).e))
            {
                return true;
            }
        }
        return false;
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public Bundle h()
    {
        return h;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), d, e
        });
    }

    public String toString()
    {
        boolean flag;
        if (b == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return String.format("Person [%s] %s", new Object[] {
                e(), f()
            });
        }
        if (b == 1 && c == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return String.format("Circle [%s] %s", new Object[] {
                d(), f()
            });
        } else
        {
            return String.format("Group [%s] %s", new Object[] {
                d(), f()
            });
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        eoj.a(this, parcel);
    }

}
