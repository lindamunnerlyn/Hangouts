// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class elw
    implements ekc
{

    public final int a;
    public final ejx b;
    public final ekc c;
    final elv d;

    public elw(elv elv1, int i, ejx ejx1, ekc ekc1)
    {
        d = elv1;
        super();
        a = i;
        b = ejx1;
        c = ekc1;
        ejx1.a(this);
    }

    public void a()
    {
        b.b(this);
        b.d();
    }

    public void a(ConnectionResult connectionresult)
    {
        elv.e(d).post(new elx(d, a, connectionresult));
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).append("GoogleApiClient #").print(a);
        printwriter.println(":");
        b.a((new StringBuilder()).append(s).append("  ").toString(), printwriter);
    }
}
