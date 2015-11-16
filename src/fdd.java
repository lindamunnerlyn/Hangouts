// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

final class fdd extends fde
{

    final FeedbackOptions a;

    fdd(emy emy, FeedbackOptions feedbackoptions)
    {
        a = feedbackoptions;
        super(emy);
    }

    protected void a(emw emw)
    {
        ((fhl)emw).a(a);
        a(((enh) (Status.a)));
    }
}
