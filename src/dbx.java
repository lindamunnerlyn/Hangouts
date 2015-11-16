// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Arrays;

public final class dbx
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new dby();
    public static final dbx a = new dbx(1, null, null, 0, null, null, null, 61);
    private int b;
    private String c;
    private String d;
    private long e;
    private int f;
    private String g;
    private String h;
    private String i;
    private int j;
    private jhb k;
    private byte l[];

    public dbx(int i1, String s, String s1, int j1, String s2, String s3, String s4, 
            int k1)
    {
        k = jhb.d();
        l = new byte[0];
        b = i1;
        c = s;
        d = s1;
        e = System.currentTimeMillis();
        f = j1;
        g = s2;
        h = s3;
        i = s4;
        j = k1;
    }

    dbx(Parcel parcel)
    {
        k = jhb.d();
        l = new byte[0];
        b = parcel.readInt();
        c = parcel.readString();
        d = parcel.readString();
        f = parcel.readInt();
        e = parcel.readLong();
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readString();
        j = parcel.readInt();
        k = jhb.c(parcel.readString());
        l = new byte[parcel.readInt()];
        parcel.readByteArray(l);
    }

    public Intent a(int i1, String s)
    {
        Object obj = c();
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        obj = (new bpa(s, 1)).i(ebz.k(((String) (obj)))).a(2).a();
        if (f == 1)
        {
            s = this;
        } else
        {
            s = new dbx(b, c, d, f, null, null, null, 61);
        }
        RealTimeChatService.a(i1, 1, s);
        obj = g.a(((boy) (obj)), h.a(Arrays.asList(new ceu[] {
            a()
        })), new ArrayList(), true, j, SystemClock.elapsedRealtime());
        ((Intent) (obj)).putExtra("recent_call_timestamp", s.e());
        return ((Intent) (obj));
    }

    public ceu a()
    {
        Object obj;
        String s;
        String s1;
        String s2;
        boolean flag;
        if (!TextUtils.isEmpty(g))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = c;
        s1 = g.p();
        s2 = h;
        if (flag)
        {
            obj = g;
        } else
        {
            obj = c;
        }
        obj = g.a(s, s1, flag, s2, ((String) (obj)), f);
        if (k.b() && l.length > 0)
        {
            ((ceu) (obj)).a((String)k.c(), l);
        }
        return ((ceu) (obj));
    }

    public void a(jhb jhb1)
    {
        if (jhb1.b())
        {
            k = jhb.b(((ajo)jhb1.c()).c());
            l = ((ajo)jhb1.c()).d();
            return;
        } else
        {
            l = new byte[0];
            k = jhb.d();
            return;
        }
    }

    public int b()
    {
        return b;
    }

    public String c()
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

    public long e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeInt(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeInt(f);
        parcel.writeLong(e);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeInt(j);
        String s;
        if (k.b())
        {
            s = (String)k.c();
        } else
        {
            s = null;
        }
        parcel.writeString(s);
        parcel.writeInt(l.length);
        parcel.writeByteArray(l);
    }

}
