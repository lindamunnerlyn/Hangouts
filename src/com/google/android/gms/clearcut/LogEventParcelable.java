// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut;

import a;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import eip;
import eoe;
import fdu;
import g;
import java.util.Arrays;

public class LogEventParcelable
    implements SafeParcelable
{

    public static final eip CREATOR = new eip();
    public final int a;
    public PlayLoggerContext b;
    public byte c[];
    public int d[];
    public final fdu e;
    public final a f;
    public final a g;

    public LogEventParcelable(int i, PlayLoggerContext playloggercontext, byte abyte0[], int ai[])
    {
        a = i;
        b = playloggercontext;
        c = abyte0;
        d = ai;
        e = null;
        f = null;
        g = null;
    }

    public LogEventParcelable(PlayLoggerContext playloggercontext, fdu fdu, a a1, a a2, int ai[])
    {
        a = 1;
        b = playloggercontext;
        e = fdu;
        f = a1;
        g = a2;
        d = ai;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof LogEventParcelable)
            {
                if (a != ((LogEventParcelable) (obj = (LogEventParcelable)obj)).a || !g.a(b, ((LogEventParcelable) (obj)).b) || !Arrays.equals(c, ((LogEventParcelable) (obj)).c) || !Arrays.equals(d, ((LogEventParcelable) (obj)).d) || !g.a(e, ((LogEventParcelable) (obj)).e) || !g.a(f, ((LogEventParcelable) (obj)).f) || !g.a(g, ((LogEventParcelable) (obj)).g))
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

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c, d, e, f, g
        });
    }

    public String toString()
    {
        Object obj1 = null;
        StringBuilder stringbuilder = new StringBuilder("LogEventParcelable[");
        stringbuilder.append(a);
        stringbuilder.append(", ");
        stringbuilder.append(b);
        stringbuilder.append(", ");
        Object obj;
        if (c == null)
        {
            obj = null;
        } else
        {
            obj = new String(c);
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(", ");
        if (d == null)
        {
            obj = obj1;
        } else
        {
            obj = new eoe(", ");
            java.util.List list = Arrays.asList(new int[][] {
                d
            });
            obj = ((eoe) (obj)).a(new StringBuilder(), list).toString();
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(", ");
        stringbuilder.append(e);
        stringbuilder.append(", ");
        stringbuilder.append(f);
        stringbuilder.append(", ");
        stringbuilder.append(g);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        eip.a(this, parcel, i);
    }

}
