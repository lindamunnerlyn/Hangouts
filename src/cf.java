// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class cf
{

    Notification A;
    public Notification B;
    public ArrayList C;
    public Context a;
    public CharSequence b;
    public CharSequence c;
    PendingIntent d;
    PendingIntent e;
    RemoteViews f;
    public Bitmap g;
    public CharSequence h;
    public int i;
    int j;
    boolean k;
    public boolean l;
    public cr m;
    public CharSequence n;
    int o;
    int p;
    boolean q;
    String r;
    boolean s;
    String t;
    public ArrayList u;
    boolean v;
    String w;
    Bundle x;
    int y;
    int z;

    public cf(Context context)
    {
        k = true;
        u = new ArrayList();
        v = false;
        y = 0;
        z = 0;
        B = new Notification();
        a = context;
        B.when = System.currentTimeMillis();
        B.audioStreamType = -1;
        j = 0;
        C = new ArrayList();
    }

    private void a(int i1, boolean flag)
    {
        if (flag)
        {
            Notification notification = B;
            notification.flags = notification.flags | i1;
            return;
        } else
        {
            Notification notification1 = B;
            notification1.flags = notification1.flags & ~i1;
            return;
        }
    }

    protected static CharSequence d(CharSequence charsequence)
    {
        while (charsequence == null || charsequence.length() <= 5120) 
        {
            return charsequence;
        }
        return charsequence.subSequence(0, 5120);
    }

    public cf a()
    {
        k = true;
        return this;
    }

    public cf a(int i1)
    {
        B.icon = i1;
        return this;
    }

    public cf a(int i1, CharSequence charsequence, PendingIntent pendingintent)
    {
        u.add(new cb(i1, charsequence, pendingintent));
        return this;
    }

    public cf a(long l1)
    {
        B.when = l1;
        return this;
    }

    public cf a(Notification notification)
    {
        A = notification;
        return this;
    }

    public cf a(PendingIntent pendingintent)
    {
        d = pendingintent;
        return this;
    }

    public cf a(Bitmap bitmap)
    {
        g = bitmap;
        return this;
    }

    public cf a(Uri uri)
    {
        B.sound = uri;
        B.audioStreamType = -1;
        return this;
    }

    public cf a(Bundle bundle)
    {
        if (x == null)
        {
            x = new Bundle(bundle);
            return this;
        } else
        {
            x.putAll(bundle);
            return this;
        }
    }

    public cf a(ch ch1)
    {
        ch1.a(this);
        return this;
    }

    public cf a(cr cr1)
    {
        if (m != cr1)
        {
            m = cr1;
            if (m != null)
            {
                m.a(this);
            }
        }
        return this;
    }

    public cf a(CharSequence charsequence)
    {
        b = d(charsequence);
        return this;
    }

    public cf a(String s1)
    {
        w = s1;
        return this;
    }

    public cf a(boolean flag)
    {
        a(16, flag);
        return this;
    }

    public cf b()
    {
        l = true;
        return this;
    }

    public cf b(int i1)
    {
        i = i1;
        return this;
    }

    public cf b(PendingIntent pendingintent)
    {
        B.deleteIntent = pendingintent;
        return this;
    }

    public cf b(CharSequence charsequence)
    {
        c = d(charsequence);
        return this;
    }

    public cf b(String s1)
    {
        r = s1;
        return this;
    }

    public cf c()
    {
        a(2, true);
        return this;
    }

    public cf c(int i1)
    {
        B.defaults = i1;
        if ((i1 & 4) != 0)
        {
            Notification notification = B;
            notification.flags = notification.flags | 1;
        }
        return this;
    }

    public cf c(PendingIntent pendingintent)
    {
        e = pendingintent;
        a(128, true);
        return this;
    }

    public cf c(CharSequence charsequence)
    {
        B.tickerText = d(charsequence);
        return this;
    }

    public cf c(String s1)
    {
        t = s1;
        return this;
    }

    public cf d()
    {
        a(8, true);
        return this;
    }

    public cf d(int i1)
    {
        j = i1;
        return this;
    }

    public cf e()
    {
        s = true;
        return this;
    }

    public cf e(int i1)
    {
        y = i1;
        return this;
    }

    public Bundle f()
    {
        if (x == null)
        {
            x = new Bundle();
        }
        return x;
    }

    public Notification g()
    {
        cj cj1 = ca.a();
        new cg();
        return cj1.a(this);
    }
}
