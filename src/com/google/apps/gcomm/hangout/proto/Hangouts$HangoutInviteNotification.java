// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kwj;
import kwk;
import kwm;
import kwq;
import kws;

public final class clear extends kwm
{

    private static volatile invitationId _emptyArray[];
    public Integer command;
    public invitationId context;
    public Integer dismissReason;
    public Integer hangoutType;
    public Long invitationId;
    public Integer notificationType;
    public Integer status;
    public String userProvidedMessage;

    public static clear[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (kwq.a)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static _emptyArray parseFrom(kwj kwj1)
    {
        return (new <init>()).mergeFrom(kwj1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)kws.mergeFrom(new <init>(), abyte0);
    }

    public <init> clear()
    {
        invitationId = null;
        context = null;
        status = null;
        command = null;
        notificationType = null;
        hangoutType = null;
        dismissReason = null;
        userProvidedMessage = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (context != null)
        {
            i = j + kwk.d(1, context);
        }
        j = i;
        if (status != null)
        {
            j = i + kwk.e(2, status.intValue());
        }
        i = j;
        if (command != null)
        {
            i = j + kwk.e(3, command.intValue());
        }
        j = i;
        if (notificationType != null)
        {
            j = i + kwk.e(5, notificationType.intValue());
        }
        i = j;
        if (hangoutType != null)
        {
            i = j + kwk.e(6, hangoutType.intValue());
        }
        j = i;
        if (dismissReason != null)
        {
            j = i + kwk.e(7, dismissReason.intValue());
        }
        i = j;
        if (userProvidedMessage != null)
        {
            i = j + kwk.b(8, userProvidedMessage);
        }
        j = i;
        if (invitationId != null)
        {
            j = i + kwk.e(9, invitationId.longValue());
        }
        return j;
    }

    public invitationId mergeFrom(kwj kwj1)
    {
_L11:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   16: 128
    //                   24: 178
    //                   40: 222
    //                   48: 274
    //                   56: 318
    //                   66: 374
    //                   72: 385;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (context == null)
        {
            context = new ();
        }
        kwj1.a(context);
          goto _L11
_L4:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            status = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            command = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            notificationType = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
            hangoutType = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            dismissReason = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        userProvidedMessage = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        invitationId = Long.valueOf(kwj1.e());
        if (true) goto _L11; else goto _L12
_L12:
    }

    public volatile kws mergeFrom(kwj kwj1)
    {
        return mergeFrom(kwj1);
    }

    public void writeTo(kwk kwk1)
    {
        if (context != null)
        {
            kwk1.b(1, context);
        }
        if (status != null)
        {
            kwk1.a(2, status.intValue());
        }
        if (command != null)
        {
            kwk1.a(3, command.intValue());
        }
        if (notificationType != null)
        {
            kwk1.a(5, notificationType.intValue());
        }
        if (hangoutType != null)
        {
            kwk1.a(6, hangoutType.intValue());
        }
        if (dismissReason != null)
        {
            kwk1.a(7, dismissReason.intValue());
        }
        if (userProvidedMessage != null)
        {
            kwk1.a(8, userProvidedMessage);
        }
        if (invitationId != null)
        {
            kwk1.b(9, invitationId.longValue());
        }
        super.writeTo(kwk1);
    }

    public ()
    {
        clear();
    }
}
