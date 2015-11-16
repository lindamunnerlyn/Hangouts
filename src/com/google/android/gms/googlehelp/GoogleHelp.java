// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.Window;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import fei;
import fhl;
import g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class GoogleHelp
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fei();
    final int a;
    String b;
    Account c;
    Bundle d;
    String e;
    int f;
    int g;
    boolean h;
    boolean i;
    List j;
    Bundle k;
    Bitmap l;
    byte m[];
    int n;
    int o;
    String p;
    Uri q;
    List r;
    int s;
    ThemeSettings t;
    List u;
    boolean v;
    ErrorReport w;
    TogglingData x;
    int y;
    PendingIntent z;

    public GoogleHelp(int i1, String s1, Account account, Bundle bundle, String s2, int j1, int k1, 
            boolean flag, boolean flag1, List list, Bundle bundle1, Bitmap bitmap, byte abyte0[], int l1, 
            int i2, String s3, Uri uri, List list1, int j2, ThemeSettings themesettings, List list2, 
            boolean flag2, ErrorReport errorreport, TogglingData togglingdata, int k2, PendingIntent pendingintent)
    {
        w = new ErrorReport();
        a = i1;
        b = s1;
        c = account;
        d = bundle;
        e = s2;
        f = j1;
        g = k1;
        h = flag;
        i = flag1;
        j = list;
        z = pendingintent;
        k = bundle1;
        l = bitmap;
        m = abyte0;
        n = l1;
        o = i2;
        p = s3;
        q = uri;
        r = list1;
        if (a >= 4) goto _L2; else goto _L1
_L1:
        themesettings = (new ThemeSettings()).a(j2);
_L4:
        t = themesettings;
        u = list2;
        v = flag2;
        w = errorreport;
        if (w != null)
        {
            w.Y = "GoogleHelp";
        }
        x = togglingdata;
        y = k2;
        return;
_L2:
        if (themesettings == null)
        {
            themesettings = new ThemeSettings();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private GoogleHelp(String s1)
    {
        this(7, s1, null, null, null, 0, 0, true, true, ((List) (new ArrayList())), null, null, null, 0, 0, null, null, ((List) (new ArrayList())), 0, null, ((List) (new ArrayList())), false, new ErrorReport(), null, 0, null);
    }

    public static Bitmap a(Activity activity)
    {
        Bitmap bitmap;
        try
        {
            activity = activity.getWindow().getDecorView().getRootView();
            bitmap = Bitmap.createBitmap(activity.getWidth(), activity.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            activity.draw(new Canvas(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return null;
        }
        return bitmap;
    }

    public static GoogleHelp a(String s1)
    {
        return new GoogleHelp(s1);
    }

    public Intent a()
    {
        return (new Intent("com.google.android.gms.googlehelp.HELP")).setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    public GoogleHelp a(int i1, String s1, Intent intent)
    {
        r.add(new OverflowMenuItem(0, s1, intent));
        return this;
    }

    public GoogleHelp a(Account account)
    {
        c = account;
        return this;
    }

    public GoogleHelp a(Uri uri)
    {
        q = uri;
        return this;
    }

    public GoogleHelp a(FeedbackOptions feedbackoptions, File file)
    {
        w = fhl.a(feedbackoptions, file);
        w.Y = "GoogleHelp";
        return this;
    }

    public GoogleHelp a(ThemeSettings themesettings)
    {
        t = themesettings;
        return this;
    }

    public Uri b()
    {
        return q;
    }

    public TogglingData c()
    {
        return x;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        int j1 = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, b);
        g.a(parcel, 3, c, i1);
        g.a(parcel, 4, d);
        g.a(parcel, 5, h);
        g.a(parcel, 6, i);
        g.b(parcel, 7, j);
        g.a(parcel, 10, k);
        g.a(parcel, 11, l, i1);
        g.a(parcel, 14, p);
        g.a(parcel, 15, q, i1);
        g.b(parcel, 17, s);
        g.c(parcel, 16, r);
        g.a(parcel, 19, m);
        g.c(parcel, 18, u);
        g.b(parcel, 21, o);
        g.b(parcel, 20, n);
        g.a(parcel, 23, w, i1);
        g.a(parcel, 22, v);
        g.a(parcel, 25, t, i1);
        g.b(parcel, 29, f);
        g.a(parcel, 28, e);
        g.a(parcel, 31, x, i1);
        g.b(parcel, 30, g);
        g.b(parcel, 32, y);
        g.a(parcel, 33, z, i1);
        g.q(parcel, j1);
    }

}
