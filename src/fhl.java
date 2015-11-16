// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public final class fhl extends eqa
{

    private Context e;

    public fhl(Context context, Looper looper, enb enb, end end, epo epo)
    {
        super(context, looper, 29, epo, enb, end);
        e = context;
    }

    public static ErrorReport a(FeedbackOptions feedbackoptions, File file)
    {
        ErrorReport errorreport = new ErrorReport();
        if (feedbackoptions != null)
        {
            if (feedbackoptions.b() != null && feedbackoptions.b().size() > 0)
            {
                errorreport.E = feedbackoptions.b();
            }
            if (!TextUtils.isEmpty(feedbackoptions.a()))
            {
                errorreport.C = feedbackoptions.a();
            }
            if (!TextUtils.isEmpty(feedbackoptions.d()))
            {
                errorreport.c = feedbackoptions.d();
            }
            if (feedbackoptions.e() != null)
            {
                errorreport.N = feedbackoptions.e().throwMethodName;
                errorreport.L = feedbackoptions.e().throwLineNumber;
                errorreport.M = feedbackoptions.e().throwClassName;
                errorreport.O = feedbackoptions.e().stackTrace;
                errorreport.J = feedbackoptions.e().exceptionClassName;
                errorreport.P = feedbackoptions.e().exceptionMessage;
                errorreport.K = feedbackoptions.e().throwFileName;
            }
            if (feedbackoptions.c() != null)
            {
                errorreport.Z = feedbackoptions.c();
            }
            if (!TextUtils.isEmpty(feedbackoptions.f()))
            {
                errorreport.Q = feedbackoptions.f();
            }
            if (!TextUtils.isEmpty(feedbackoptions.h()))
            {
                errorreport.b.packageName = feedbackoptions.h();
            }
            if (feedbackoptions.g() != null && file != null)
            {
                errorreport.T = feedbackoptions.g();
                errorreport.T.a(file);
            }
            if (feedbackoptions.i() != null && feedbackoptions.i().size() != 0 && file != null)
            {
                for (Iterator iterator = feedbackoptions.i().iterator(); iterator.hasNext(); ((FileTeleporter)iterator.next()).a(file)) { }
                errorreport.V = (FileTeleporter[])feedbackoptions.i().toArray(new FileTeleporter[feedbackoptions.i().size()]);
            }
            if (feedbackoptions.k() != null)
            {
                errorreport.aa = feedbackoptions.k();
            }
            errorreport.X = feedbackoptions.j();
        }
        return errorreport;
    }

    protected IInterface a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        if (iinterface != null && (iinterface instanceof fhm))
        {
            return (fhm)iinterface;
        } else
        {
            return new fho(ibinder);
        }
    }

    protected String a()
    {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    public void a(FeedbackOptions feedbackoptions)
    {
        ((fhm)m()).a(a(feedbackoptions, e.getCacheDir()));
    }

    protected String b()
    {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }
}
