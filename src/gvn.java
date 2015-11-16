// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gvn
    implements Runnable
{

    final guy a;
    final gvk b;

    gvn(gvk gvk1, guy guy1)
    {
        b = gvk1;
        a = guy1;
        super();
    }

    public void run()
    {
        guy guy1;
        android.content.Context context;
        gvv gvv2;
        boolean flag;
        flag = false;
        guy1 = a;
        context = gvk.c(b);
        gvv2 = new gvv(false);
        if (context != null) goto _L2; else goto _L1
_L1:
        if (guy1.e() == null) goto _L3; else goto _L2
_L3:
        gvv gvv1;
        g.c(flag, "You must provide a Context with your background task, or if you're using deprecated methods, you must provide your BackgroundTask with a Context.");
        gvv1 = guy1.a();
        Object obj;
        obj = gvv1;
        if (gvv1 != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj = gvv1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj = guy1.a(context);
        Exception exception;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler;
        try
        {
            obj = String.valueOf(guy1.getClass());
            throw new AssertionError((new StringBuilder(String.valueOf(obj).length() + 31)).append("Null result in BackgroundTask: ").append(((String) (obj))).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        uncaughtexceptionhandler = Thread.getDefaultUncaughtExceptionHandler();
        if (uncaughtexceptionhandler == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        uncaughtexceptionhandler.uncaughtException(Thread.currentThread(), ((Throwable) (obj)));
        guy1.e.a(guy1, gvv2);
        guy1.d(context);
        return;
        ((gvv) (obj)).a(guy1.f);
        obj.b = itr.a();
        guy1.e.a(guy1, ((gvv) (obj)));
        guy1.d(context);
        return;
        obj;
        guy1.d(context);
        throw obj;
        throw new RuntimeException(((Throwable) (obj)));
        guy1.e.a(guy1, gvv2);
        guy1.d(context);
        throw exception;
        exception;
        guy1.d(context);
        throw exception;
        exception;
        guy1.d(context);
        throw exception;
_L2:
        flag = true;
        if (true) goto _L3; else goto _L4
_L4:
    }
}
