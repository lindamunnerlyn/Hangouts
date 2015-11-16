// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class grc
    implements Runnable
{

    final gqn a;
    final gqz b;

    grc(gqz gqz1, gqn gqn1)
    {
        b = gqz1;
        a = gqn1;
        super();
    }

    public void run()
    {
        gqn gqn1;
        android.content.Context context;
        grk grk2;
        boolean flag;
        flag = false;
        gqn1 = a;
        context = gqz.c(b);
        grk2 = new grk(false);
        if (context != null) goto _L2; else goto _L1
_L1:
        if (gqn1.e() == null) goto _L3; else goto _L2
_L3:
        grk grk1;
        g.a(flag, "You must provide a Context with your background task, or if you're using deprecated methods, you must provide your BackgroundTask with a Context.");
        grk1 = gqn1.a();
        Object obj;
        obj = grk1;
        if (grk1 != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj = grk1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj = gqn1.a(context);
        Exception exception;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler;
        try
        {
            obj = String.valueOf(gqn1.getClass());
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
        gqn1.c.a(gqn1, grk2);
        gqn1.d(context);
        return;
        ((grk) (obj)).a(gqn1.d);
        obj.b = inn.a();
        gqn1.c.a(gqn1, ((grk) (obj)));
        gqn1.d(context);
        return;
        obj;
        gqn1.d(context);
        throw obj;
        throw new RuntimeException(((Throwable) (obj)));
        gqn1.c.a(gqn1, grk2);
        gqn1.d(context);
        throw exception;
        exception;
        gqn1.d(context);
        throw exception;
        exception;
        gqn1.d(context);
        throw exception;
_L2:
        flag = true;
        if (true) goto _L3; else goto _L4
_L4:
    }
}
