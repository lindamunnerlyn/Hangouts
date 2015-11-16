// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;

public interface fry
    extends IInterface
{

    public abstract void a(int i);

    public abstract void a(int i, Account account, frv frv);

    public abstract void a(AuthAccountRequest authaccountrequest, frv frv);

    public abstract void a(ResolveAccountRequest resolveaccountrequest, eob eob);

    public abstract void a(CheckServerAuthResult checkserverauthresult);

    public abstract void a(RecordConsentRequest recordconsentrequest, frv frv);

    public abstract void a(emq emq, int i, boolean flag);

    public abstract void a(frv frv);

    public abstract void a(boolean flag);
}
