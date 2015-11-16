// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut;

import a;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import elq;
import ere;
import fgs;
import g;
import java.util.Arrays;

public class LogEventParcelable
    implements SafeParcelable
{

    public static final elq CREATOR = new elq();
    public final int a;
    public PlayLoggerContext b;
    public byte c[];
    public int d[];
    public final fgs e;
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

    public LogEventParcelable(PlayLoggerContext playloggercontext, fgs fgs, a a1, a a2, int ai[])
    {
        a = 1;
        b = playloggercontext;
        e = fgs;
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
            obj = new ere(", ");
            java.util.List list = Arrays.asList(new int[][] {
                d
            });
            obj = ((ere) (obj)).a(new StringBuilder(), list).toString();
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
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, b, i);
        g.a(parcel, 3, c);
        int ai[] = d;
        if (ai != null)
        {
            i = g.p(parcel, 4);
            parcel.writeIntArray(ai);
            g.q(parcel, i);
        }
        g.q(parcel, j);
    }

}
