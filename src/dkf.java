// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class dkf extends Binder
{

    final RequestWriter a;

    public dkf(RequestWriter requestwriter)
    {
        a = requestwriter;
        super();
    }

    public dkb a()
    {
        return a;
    }
}
