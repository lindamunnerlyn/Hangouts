// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Scope;

public final class fsh
{

    public static final ejw a;
    public static final ejw b;
    public static final ejt c;
    static final ejt d;
    public static final Scope e = new Scope("profile");
    public static final Scope f = new Scope("email");
    public static final ejs g;
    public static final ejs h;
    public static final fsk i = new fsk();

    static 
    {
        a = new ejw();
        b = new ejw();
        c = new fsi();
        d = new fsj();
        g = new ejs("SignIn.API", c, a);
        h = new ejs("SignIn.INTERNAL_API", d, b);
    }
}
