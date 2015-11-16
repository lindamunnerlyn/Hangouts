// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ApplicationErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

public final class fai extends fah
{

    private final ApplicationErrorReport a = new ApplicationErrorReport();
    private String b;

    public fai()
    {
        a.crashInfo = new android.app.ApplicationErrorReport.CrashInfo();
        a.crashInfo.throwLineNumber = -1;
    }

    public FeedbackOptions a()
    {
        h.a(a.crashInfo.exceptionClassName);
        h.a(a.crashInfo.throwFileName);
        h.a(a.crashInfo.throwClassName);
        h.a(a.crashInfo.throwMethodName);
        h.a(a.crashInfo.stackTrace);
        return FeedbackOptions.d(FeedbackOptions.a(super.a(), a.crashInfo), b);
    }
}
