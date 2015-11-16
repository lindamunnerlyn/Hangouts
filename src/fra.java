// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.playlog.internal.LogEvent;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class fra
{

    private final frk a;
    private PlayLoggerContext b;

    private fra(Context context, int i, String s, frb frb, String s1)
    {
        this(context, 50, s, null, frb, null);
    }

    private fra(Context context, int i, String s, String s1, frb frb, String s2)
    {
        int j;
        s1 = context.getPackageName();
        j = 0;
        int k = context.getPackageManager().getPackageInfo(s1, 0).versionCode;
        j = k;
_L2:
        b = new PlayLoggerContext(s1, j, i, s, null, true);
        a = new frk(context, context.getMainLooper(), new frj(frb), new emo(null, null, null, 49, null, s1, s2, null));
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.wtf("PlayLogger", "This can't happen.");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public fra(Context context, String s, frb frb)
    {
        this(context, 50, s, frb, null);
    }

    public void a()
    {
        a.o();
    }

    public transient void a(long l, String s, byte abyte0[], String as[])
    {
        a.a(b, new LogEvent(l, s, abyte0, as));
    }

    public transient void a(String s, byte abyte0[], String as[])
    {
        a(System.currentTimeMillis(), s, abyte0, as);
    }
}
