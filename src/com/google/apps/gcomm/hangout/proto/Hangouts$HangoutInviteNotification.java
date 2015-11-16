// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kog;
import koh;
import koj;
import kon;
import kop;

public final class clear extends koj
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
            synchronized (kon.a)
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

    public static _emptyArray parseFrom(kog kog1)
    {
        return (new <init>()).mergeFrom(kog1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)kop.mergeFrom(new <init>(), abyte0);
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
            i = j + koh.d(1, context);
        }
        j = i;
        if (status != null)
        {
            j = i + koh.e(2, status.intValue());
        }
        i = j;
        if (command != null)
        {
            i = j + koh.e(3, command.intValue());
        }
        j = i;
        if (notificationType != null)
        {
            j = i + koh.e(5, notificationType.intValue());
        }
        i = j;
        if (hangoutType != null)
        {
            i = j + koh.e(6, hangoutType.intValue());
        }
        j = i;
        if (dismissReason != null)
        {
            j = i + koh.e(7, dismissReason.intValue());
        }
        i = j;
        if (userProvidedMessage != null)
        {
            i = j + koh.b(8, userProvidedMessage);
        }
        j = i;
        if (invitationId != null)
        {
            j = i + koh.e(9, invitationId.longValue());
        }
        return j;
    }

    public invitationId mergeFrom(kog kog1)
    {
_L11:
        int i = kog1.a();
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
        if (super.storeUnknownField(kog1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (context == null)
        {
            context = new ();
        }
        kog1.a(context);
          goto _L11
_L4:
        int j = kog1.f();
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
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            command = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int l = kog1.f();
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
        int i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
            hangoutType = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kog1.f();
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
        userProvidedMessage = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        invitationId = Long.valueOf(kog1.e());
        if (true) goto _L11; else goto _L12
_L12:
    }

    public volatile kop mergeFrom(kog kog1)
    {
        return mergeFrom(kog1);
    }

    public void writeTo(koh koh1)
    {
        if (context != null)
        {
            koh1.b(1, context);
        }
        if (status != null)
        {
            koh1.a(2, status.intValue());
        }
        if (command != null)
        {
            koh1.a(3, command.intValue());
        }
        if (notificationType != null)
        {
            koh1.a(5, notificationType.intValue());
        }
        if (hangoutType != null)
        {
            koh1.a(6, hangoutType.intValue());
        }
        if (dismissReason != null)
        {
            koh1.a(7, dismissReason.intValue());
        }
        if (userProvidedMessage != null)
        {
            koh1.a(8, userProvidedMessage);
        }
        if (invitationId != null)
        {
            koh1.b(9, invitationId.longValue());
        }
        super.writeTo(koh1);
    }

    public ()
    {
        clear();
    }
}
