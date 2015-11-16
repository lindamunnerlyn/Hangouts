// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

final class faf extends fag
{

    final FeedbackOptions a;

    faf(ejx ejx, FeedbackOptions feedbackoptions)
    {
        a = feedbackoptions;
        super(ejx);
    }

    protected void a(ejv ejv)
    {
        ((fen)ejv).a(a);
        a(((ekg) (Status.a)));
    }
}
