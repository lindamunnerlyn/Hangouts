// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.metrics;


// Referenced classes of package org.chromium.base.metrics:
//            RecordUserAction

final class 
    implements Runnable
{

    final String a;

    public void run()
    {
        RecordUserAction.a(a);
    }
}
