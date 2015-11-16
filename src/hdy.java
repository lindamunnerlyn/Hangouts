// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class hdy
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hdz();
    private final String a;
    private final hef b;
    private final String c;
    private final Uri d;
    private final hee e;
    private final int f;
    private final String g;

    hdy(Parcel parcel)
    {
        a = parcel.readString();
        c = parcel.readString();
        String s = parcel.readString();
        if (s != null)
        {
            d = Uri.parse(s);
        } else
        {
            d = null;
        }
        e = hee.a(parcel.readInt());
        g = parcel.readString();
        b = (hef)hef.CREATOR.createFromParcel(parcel);
        f = parcel.readInt();
    }

    private hdy(String s, String s1, int j, long l, String s2, Uri uri, 
            hee hee1, String s3)
    {
        b = new hef(null, 0L);
        f = j;
        a = null;
        c = s2;
        d = null;
        e = hee1;
        g = null;
        if (!g() && !h())
        {
            throw new IllegalArgumentException("MediaRef has neither url nor local uri!");
        } else
        {
            return;
        }
    }

    public static hdy a(Context context, String s, hee hee1)
    {
        int j = -1;
        context = (gqu)hlp.b(context, gqu);
        if (context != null)
        {
            j = context.a();
        }
        return new hdy(null, null, j, 0L, s, null, hee1, null);
    }

    public long a()
    {
        return b.a();
    }

    public String b()
    {
        return c;
    }

    public Uri c()
    {
        return d;
    }

    public String d()
    {
        return g;
    }

    public int describeContents()
    {
        return 0;
    }

    public hee e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof hdy)
            {
                obj = (hdy)obj;
                if (b.a() != ((hdy) (obj)).a())
                {
                    return false;
                }
                if (!TextUtils.equals(c, ((hdy) (obj)).c))
                {
                    return false;
                }
                if (!TextUtils.equals(g, ((hdy) (obj)).g))
                {
                    return false;
                }
                Uri uri = d;
                Uri uri1 = ((hdy) (obj)).d;
                boolean flag;
                if (uri != null && uri1 != null)
                {
                    flag = uri.equals(uri1);
                } else
                if (uri == null && uri1 == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    return false;
                }
                if (e != ((hdy) (obj)).e)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int f()
    {
        return f;
    }

    public boolean g()
    {
        return c != null;
    }

    public boolean h()
    {
        return d != null;
    }

    public int hashCode()
    {
        int i1 = 0;
        int j1 = (int)(b.a() ^ b.a() >>> 32);
        int j;
        int k;
        int l;
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.hashCode();
        }
        if (g == null)
        {
            k = 0;
        } else
        {
            k = g.hashCode();
        }
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.hashCode();
        }
        if (e != null)
        {
            i1 = e.hashCode();
        }
        return (l + (k + (j + (j1 + 31) * 31) * 31) * 31) * 31 + i1;
    }

    public boolean i()
    {
        return b.b();
    }

    public String toString()
    {
        String s1 = String.valueOf(getClass().getSimpleName());
        String s2 = String.valueOf(Integer.toHexString(System.identityHashCode(this)));
        String s3 = String.valueOf(b);
        String s4 = a;
        String s5 = c;
        String s;
        String s6;
        String s7;
        if (d != null)
        {
            s = String.valueOf(d);
        } else
        {
            s = null;
        }
        s = String.valueOf(s);
        s6 = String.valueOf(e);
        s7 = g;
        return (new StringBuilder(String.valueOf(s1).length() + 25 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s).length() + String.valueOf(s6).length() + String.valueOf(s7).length())).append(s1).append("@").append(s2).append("[").append(s3).append(", ti-").append(s4).append(", u-").append(s5).append(", l-").append(s).append(", ty-").append(s6).append(", s-").append(s7).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeString(a);
        parcel.writeString(c);
        if (d != null)
        {
            parcel.writeString(d.toString());
        } else
        {
            parcel.writeString(null);
        }
        parcel.writeInt(e.e);
        parcel.writeString(g);
        b.writeToParcel(parcel, j);
        parcel.writeInt(f);
    }

}
