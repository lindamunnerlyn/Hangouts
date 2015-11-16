// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Patterns;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ceu
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new cev();
    private static final long serialVersionUID = 1L;
    public List A;
    public List B;
    public String C;
    public int D;
    public Set E;
    private String F;
    private byte G[];
    public cfa a;
    public cey b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Boolean i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public String s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public String x;
    public boolean y;
    public boolean z;

    public ceu()
    {
        v = true;
        w = 0;
        D = cew.a;
        G = new byte[0];
    }

    public static String a(Context context)
    {
        return context.getResources().getString(h.iD);
    }

    static String a(ceu ceu1, String s1)
    {
        ceu1.F = s1;
        return s1;
    }

    public static String a(String s1)
    {
        if (s1 != null)
        {
            if (!TextUtils.isEmpty(s1 = s1.trim()))
            {
                int i1 = s1.indexOf(' ');
                if (i1 >= 0)
                {
                    return s1.substring(0, i1);
                } else
                {
                    return s1;
                }
            }
        }
        return null;
    }

    static byte[] a(ceu ceu1)
    {
        return ceu1.G;
    }

    static byte[] a(ceu ceu1, byte abyte0[])
    {
        ceu1.G = abyte0;
        return abyte0;
    }

    public void a(String s1, String s2)
    {
        if (s1 != null)
        {
            e = s1;
        }
        if (s2 != null)
        {
            h = s2;
        }
    }

    public void a(String s1, byte abyte0[])
    {
        F = s1;
        G = abyte0;
    }

    public boolean a()
    {
        return !TextUtils.isEmpty(b());
    }

    public String b()
    {
        if (b != null)
        {
            return b.a;
        } else
        {
            return null;
        }
    }

    public void b(String s1)
    {
        q = s1;
    }

    public String c()
    {
        if (b != null)
        {
            return b.b;
        } else
        {
            return null;
        }
    }

    public void c(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            g = a(g.nS);
            return;
        } else
        {
            g = s1;
            return;
        }
    }

    public byte[] d()
    {
        return G;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        boolean flag;
        if (F == null || !F.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag, "Illegal states for CallerIdPhoneNumber, only null or non-zero-length values are permitted");
        return F;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ceu)
        {
            obj = (ceu)obj;
            if (b != null && ((ceu) (obj)).b != null)
            {
                return b.a(((ceu) (obj)).b);
            }
        }
        return false;
    }

    public String f()
    {
        return c;
    }

    public boolean g()
    {
        return c != null;
    }

    public boolean h()
    {
        return a == cfa.d;
    }

    public int hashCode()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.hashCode();
        }
    }

    public boolean i()
    {
        return !TextUtils.isEmpty(c) && Patterns.EMAIL_ADDRESS.matcher(c).matches();
    }

    public String j()
    {
        return q;
    }

    public String k()
    {
        String s2 = b();
        String s1 = s2;
        if (s2 != null)
        {
            s1 = s2;
            if (s2.startsWith("g:"))
            {
                s1 = s2.substring(2);
            }
        }
        return s1;
    }

    public String toString()
    {
        String s1 = String.valueOf(b);
        String s2 = String.valueOf(a);
        String s3 = c;
        String s4 = e;
        String s5 = f;
        String s6 = g;
        String s7 = h;
        String s8 = String.valueOf(i);
        return (new StringBuilder(String.valueOf(s1).length() + 98 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length())).append("ParticipantEntity {id:").append(s1).append(", type:").append(s2).append(" phoneNumber:").append(s3).append(" displayName:").append(s4).append(" firstName:").append(s5).append(" fallbackName:").append(s6).append(" avatar:").append(s7).append(" blocked:").append(s8).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeInt(a.ordinal());
        parcel.writeParcelable(b, i1);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(r);
        parcel.writeString(s);
        if (t)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeInt(w);
        parcel.writeString(F);
        parcel.writeInt(G.length);
        parcel.writeByteArray(G);
    }

}
