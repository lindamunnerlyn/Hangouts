// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ApplicationErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

public final class fdg extends fdf
{

    private final ApplicationErrorReport a = new ApplicationErrorReport();
    private String b;

    public fdg()
    {
        a.crashInfo = new android.app.ApplicationErrorReport.CrashInfo();
        a.crashInfo.throwLineNumber = -1;
    }

    public FeedbackOptions a()
    {
        g.d(a.crashInfo.exceptionClassName);
        g.d(a.crashInfo.throwFileName);
        g.d(a.crashInfo.throwClassName);
        g.d(a.crashInfo.throwMethodName);
        g.d(a.crashInfo.stackTrace);
        return FeedbackOptions.d(FeedbackOptions.a(super.a(), a.crashInfo), b);
    }
}
