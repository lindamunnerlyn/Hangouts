// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class gzg
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gzh();
    private final String a;
    private final gzp b;
    private final String c;
    private final Uri d;
    private final gzo e;
    private final int f;
    private final String g;

    gzg(Parcel parcel)
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
        e = gzo.a(parcel.readInt());
        g = parcel.readString();
        b = (gzp)gzp.CREATOR.createFromParcel(parcel);
        f = parcel.readInt();
    }

    private gzg(String s, String s1, int j, long l, String s2, Uri uri, 
            gzo gzo1, String s3)
    {
        b = new gzp(null, 0L);
        f = j;
        a = null;
        c = s2;
        d = null;
        e = gzo1;
        g = null;
        if (!g() && !h())
        {
            throw new IllegalArgumentException("MediaRef has neither url nor local uri!");
        } else
        {
            return;
        }
    }

    public static gzg a(Context context, String s, gzo gzo1)
    {
        byte byte0 = -1;
        gzm gzm1 = (gzm)hgx.b(context, gzm);
        int j = byte0;
        if (gzm1 != null)
        {
            j = byte0;
            if (gzm1.a())
            {
                context = (gmo)hgx.b(context, gmo);
                j = byte0;
                if (context != null)
                {
                    j = context.a();
                }
            }
        }
        return new gzg(null, null, j, 0L, s, null, gzo1, null);
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

    public gzo e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof gzg)
            {
                obj = (gzg)obj;
                if (b.a() != ((gzg) (obj)).a())
                {
                    return false;
                }
                if (!TextUtils.equals(c, ((gzg) (obj)).c))
                {
                    return false;
                }
                if (!TextUtils.equals(g, ((gzg) (obj)).g))
                {
                    return false;
                }
                Uri uri = d;
                Uri uri1 = ((gzg) (obj)).d;
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
                if (e != ((gzg) (obj)).e)
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
